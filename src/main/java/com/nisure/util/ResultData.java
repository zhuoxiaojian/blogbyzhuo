package com.nisure.util;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-27
 * Time: 11:26
 */
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午9:59:27
 */
public class ResultData extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ResultData() {
        put("code", 0);
    }

    public static ResultData error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static ResultData error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ResultData error(int code, String msg) {
        ResultData r = new ResultData();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResultData ok(String msg) {
        ResultData r = new ResultData();
        r.put("msg", msg);
        return r;
    }

    public static ResultData ok(Map<String, Object> map) {
        ResultData r = new ResultData();
        r.putAll(map);
        return r;
    }

    public static ResultData ok() {
        return new ResultData();
    }

    public ResultData put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}