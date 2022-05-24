package com.smartMvc.Core.Handle;

import com.smartMvc.Core.Anno.GetMapper;
import com.smartMvc.Core.Anno.PostMapper;
import com.smartMvc.Core.Anno.ScanController;
import com.smartMvc.Core.ReqFunc.PostReqFunc;
import com.smartMvc.Core.ReqFunc.getReqFunc;
import com.smartMvc.Core.ReqFunc.iFunc;

import java.lang.reflect.Method;
import java.util.*;


/**
 * 获取映射关系
 */
public class HandleRequest {
    private Map<String, getReqFunc> getMaps=new HashMap<>();

    private Map<String, PostReqFunc> postMap=new HashMap<>();

    public iFunc getReqFunc(String url,String type){
        if (type.equals("POST")){
            return postMap.get(url);
        }
        return getMaps.get(url);
    }

    public void Load(Class cla) throws ClassNotFoundException {
        String Mainpath="com.smartMvc.Main";
        Class<?> aClass = Class.forName(Mainpath);
        try {
            if (aClass.isAnnotationPresent(ScanController.class)){
                ScanController annotation = aClass.getAnnotation(ScanController.class);

                //获取Controller位置
                String path= annotation.path();


                Class<?> CtlClass = Class.forName(path);

                for (Method method : CtlClass.getMethods()) {

                    if (method.isAnnotationPresent(GetMapper.class)){
                        GetMapper annotation1 = method.getAnnotation(GetMapper.class);
                        getReqFunc getReqFunc = new getReqFunc();
                        getReqFunc.intstanc=CtlClass;
                        getReqFunc.method=method;
                        //getReqFunc.parameterNames=method.getParameters();

                        getMaps.put(annotation1.UrL(),getReqFunc);

                    }else if(method.isAnnotationPresent(PostMapper.class)){
                        PostMapper mapper=CtlClass.getAnnotation(PostMapper.class);

                        PostReqFunc postFunc=new PostReqFunc();

                        postMap.put(mapper.Url(),postFunc);
                    }

                }
            }

        } catch (Exception e){

        }

    }


}
