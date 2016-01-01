/**
 * Created by intelligrape on 31/12/15.
 */
print("Hello Wolrd from script.js");


var fun1 = function (name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
};

function run() {
    print("Executing Top level run() in js");
}


var MyJavaClass = Java.type('com.my.pack.HelloWorld');

//Calling static method of a class :
var result = MyJavaClass.staticFunction('Vaibhav Sharma');
print(result + " but printed through js file");

var object = new MyJavaClass;
var res = object.nonStaticFunction('Vaibhav');
print(res);

print("Js file is accessing java global variable :- " + javaGlobalVar);

var user = {
    getFullName: function (firstName, lastName) {
        print("Executing getFullName() of user in js");
        return firstName + " : " + lastName;
    },
    run: function () {
        print("Executing run() of user in js");
    }
};

var javaStringClass=Java.type('java.lang.String');
var joinedString=javaStringClass.join("-","Hello"," World","me");
print("joinedString >> "+joinedString);