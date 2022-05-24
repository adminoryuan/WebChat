package com.smartMvc.Core.ReqFunc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface iFunc {
    void invoke(HttpServletResponse response, HttpServletRequest request);
}
