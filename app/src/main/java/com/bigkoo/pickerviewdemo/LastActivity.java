package com.bigkoo.pickerviewdemo;

import android.app.Activity;


public class LastActivity extends Activity {
//    private ArrayList<String> options1Items = new ArrayList<>();
//    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
//    private ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<>();
//    private JsonBeans jsonBeans;
//    private ArrayList<JsonBean> jSonbean;
//    private Dialogs buiid;
//    private Button btn_he;
//    private View inflate;
//    private PopupWindow popupWindow;
//    private ArrayList<String> provinces;
//    private ArrayList<ArrayList<ArrayList<String>>> province_city_air;
//    private ArrayList<ArrayList<String>> provinces_city;
//    private ArrayList<String> first;
//    private ArrayList<ArrayList<String>> first_second;
//    private ArrayList<ArrayList<ArrayList<String>>> first_third;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        btn_he = findViewById(R.id.he);
//    }
//    public void abb(View view) throws JSONException {
//
////        showpopwindow();
//
////        Mynewclass mynewclass = new Mynewclass(LastActivity.this);
////        mynewclass.show();
//
//        String JsonData = new GetJsonDataUtil().getJson(this,"provin.json");//获取assets目录下的json文件数据
//        transdata(JsonData);
////        buiid = new Dialogs.Builder(LastActivity.this, new Dialogs.Callback<String>() {
////            @Override
////            public void success(final String s) {
////              runOnUiThread(new Runnable() {
////                  @Override
////                  public void run() {
////                      btn_he.setText(s);
////                  }
////              });
////            }
////            @Override
////            public void fail(String s) {
////
////            }
////        }).setsize(20).buiid();
//    }
//    public void transdata(String string) throws JSONException {
//        Gson gson = new Gson();
//        jsonBeans = gson.fromJson(string, JsonBeans.class);
//        jSonbean = getJSonbean(jsonBeans);
//        OptionsPickerView pvOptions = new OptionsPickerView.Builder(LastActivity.this, new OptionsPickerView.OnOptionsSelectListener() {
//            @Override
//            public void onOptionsSelect(int options1, int options2, int options3, View v) {
//            }
//        }).setTitleText("选择活动").setDividerColor(Color.BLACK).setTextColorCenter(Color.BLACK).setContentTextSize(20).setLinkage(true).build();
//        pvOptions.setPicker(first,first_second,first_third);
//        pvOptions.show();
//    }
//
//    public ArrayList<JsonBean> getJSonbean(JsonBeans jsonBeans){
//        ArrayList<JsonBean> jsonBeanArrayList = new ArrayList<>();
//        JsonBeans.DataBeanXX dataBeanXX;
//        JsonBeans.DataBeanXX.DataBeanX dataBeanX;
//        JsonBeans.DataBeanXX.DataBeanX.DataBean dataBean;
//        provinces = new ArrayList<>();
//        first = new ArrayList<>();
//        first_second = new ArrayList<>();
//        first_third = new ArrayList<>();
//        for (int i = 0; i < jsonBeans.data.size(); i++) {//第一级
//            dataBeanXX =jsonBeans.data.get(i);
//            ArrayList<String> second=new ArrayList<>();
//            ArrayList<ArrayList<String>> second_first = new ArrayList<>();
//            for (int j = 0; j < dataBeanXX.data.size(); j++) {
//                dataBeanX = dataBeanXX.data.get(j);
//                ArrayList<String> third=new ArrayList<>();
//                for (int k = 0; k < dataBeanX.getData().size(); k++) {
//                    dataBean = dataBeanX.getData().get(k);
//                    third.add(dataBean.getName());
//                }
//                second.add(dataBeanX.getName());
//                second_first.add(third);
//            }
//            first.add(dataBeanXX.getName());
//            first_second.add(second);
//            first_third.add(second_first);
//        }
//        return jsonBeanArrayList;
//    }
//    public void showpopwindow(){;
//        if(popupWindow!=null){
//            if(popupWindow.isShowing()){
//                return;
//            }
//        }
//        inflate = LayoutInflater.from(LastActivity.this).inflate(R.layout.dialog_tip, null);
//        popupWindow = new PopupWindow(inflate);
//        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
//        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
//        popupWindow.setAnimationStyle(R.style.MyDialog);
////        popupWindow.showAsDropDown(btn_he,0,0);
//        View inflates = LayoutInflater.from(LastActivity.this).inflate(R.layout.activity_main, null);
//        popupWindow.showAtLocation(inflates, Gravity.BOTTOM,0,0);
//    }
}
