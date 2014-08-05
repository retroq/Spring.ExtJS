/**
 * Created with IntelliJ IDEA.
 * User: che
 * Date: 04.08.14
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */

Ext.require(["Ext.Msg"]);
var store;
Ext.onReady(function(){
   Ext.Msg.alert("Hello", "Anton");
    Ext.define("POJOBean", {
        extend:"Ext.data.Model",
        fields:["beanName", "ids", "nestedPOJOBean"],

        hasOne:{model:"NestedPOJOBean", name:"nestedPOJOBean"},
        proxy:{
            type:"rest",
            url:"getPOJO",
            reader:{
                type:"json"
            }
        }
    });

    Ext.define("NestedPOJOBean", {
        extend:"Ext.data.Model",
        fields:["name"],
        idProperty:"name",
        belongsTo:"POJOBean"
    });

    Ext.define("POJOStore", {
       extend:"Ext.data.Store",
        model:"POJOBean",
        proxy:{
            type:"rest",
            url:"getPOJO",
            reader:{
                type:"json"
            }
        }
    });
    store = new POJOStore();
    store.load();
    POJOBean.load("asd");
});
