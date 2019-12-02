package chain_of_responsibility.servlet.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过责任链的方式，是现实简单的request,response
 * 思路：首先进入FilterChain的doFilter的方法，通过index获取当前的位置，用来获取存入的责任对象
 * 每当责任对象的request的逻辑执行完之后，就直接调用doFilter方法进入下一责任对象，当所有的责任对象都执行完之后，
 * 就往下执行，每当责任对象执行完之后，就回到上一个刚刚调用他的责任对象的方法里，往下执行，知道全部结束。
 */
public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 xxxxx.com ，大家都是996 ";
        Response response = new Response();
        response.str = "response";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response, chain);
        System.out.println(request.str);
        System.out.println(response.str);

    }
}

interface Filter {
    boolean doFilter(Request request, Response response, FilterChain chain);
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "HTMLFilter()";
        chain.doFilter(request, response, chain);
        response.str += "--HTMLFilter()";
        return true;
    }
}

class Request {
    String str;
}

class Response {
    String str;
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("996", "955") + " SensitiveFilter()";
        chain.doFilter(request, response, chain);
        response.str += "--SensitiveFilter()";
        return true;
    }
}


class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if(index == filters.size()) return false;
        Filter f = filters.get(index);
        index ++;

        return f.doFilter(request, response, chain);
    }
}
