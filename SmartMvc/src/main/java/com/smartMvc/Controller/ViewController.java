package com.smartMvc.Controller;


import com.smartMvc.Core.Anno.GetMapper;
import com.smartMvc.Core.ReqFunc.ViewAndModel;

public class ViewController {

    @GetMapper(UrL = "/index")
    public ViewAndModel Index(){
        ViewAndModel viewAndModel = new ViewAndModel();
        viewAndModel.setView("index.jsp");
        viewAndModel.AddModel("name","张三");
        return viewAndModel;
    }

}
