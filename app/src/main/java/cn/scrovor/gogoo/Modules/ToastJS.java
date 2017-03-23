package cn.scrovor.gogoo.Modules;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class ToastJS extends ReactContextBaseJavaModule{
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY  = "LONG";

  public ToastJS(ReactApplicationContext reactContext){
    super(reactContext);
  }

    /**
     * 返回的这个名字是必须的，在rn代码中需要这个名字来调用该类的方法
     * @return String
     */
  @Override
  public String getName(){
    return "ToastJS";
  }
    /**
     * 一个可选的方法getContants返回了需要导出给JavaScript使用的常量。
     * 它并不一定需要实现，但在定义一些可以被JavaScript同步访问到的预定义的值时非常有用
     * @return
     */
  @Override
  public Map<String,Object> getConstants(){
    final Map<String,Object> constants = new HashMap<>();
    constants.put(DURATION_LONG_KEY,Toast.LENGTH_SHORT);
    constants.put(DURATION_SHORT_KEY,Toast.LENGTH_LONG);
    return constants;
  }

  @ReactMethod
  public void show(String message){
    Toast.makeText(getReactApplicationContext(),message,Toast.LENGTH_LONG).show();
  }
}