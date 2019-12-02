package chain_of_responsibility.servlet.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链
 * 通过实现接口的方法，将所有的过滤逻辑到放到过滤链上，一个个去执行
 */
public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 xxxxx.com ，大家都是996 ";
        Response response = new Response();
        response.str = "";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensiticeFilter());
        chain.doFilter(request,response);
        System.out.println(request.str);
    }
}

interface Filter{
    boolean doFilter(Request request, Response response);
}


class HTMLFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("<","{").replaceAll(">","}");

        return true;
    }
}



class Request{
    String str;
}


class Response{
    String str;
}

class SensiticeFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("996","222");
        return true;
    }
}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response) {

        for (Filter f : filters) {
            f.doFilter(request,response);
        }
        return true;
    }
}