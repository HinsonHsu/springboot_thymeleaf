### 代码地址
https://github.com/HinsonHsu/springboot_thymeleaf

### 技术框架
+ 后端语言：java
+ 后端框架：springboot
+ Java构建和依赖管理工具：maven
+ 前端语言：html、js、css
+ 前端框架：ajax
+ 模板引擎：thymeleaf
+ 数据库：mysql
+ 数据库持久层框架：mybatis
+ 开发环境：IntelliJ IDEA

### 相关名词解释
+ 后端语言是java，前端语言是html、js、css。
+ mybatis：
用于数据的持久化过程，将数据的表记录转为java 对象后，方便在代码中快速操作数据库的内容。
+ thymeleaf：
作为Web开发模板引擎，是为了使用户界面与业务数据（内容）分离而产生的，
html+后端数据才能形成动态的页面，thymeleaf是将java对象能够嵌入到html模板中。
+ maven：Java构建和依赖管理工具
+ ajax：能够快速地将增量更新呈现在用户界面上，而不需要重载（刷新）整个页面，这使得程序能够更快地回应用户的操作

### 相关流程：
当用户在浏览器输入地址后，在controller层搜索搜索到匹配的controller，controller中会调用service的方法，进行数据库的增删改查，获取到结果后，再通过Model方式，将数据传递给thymeleaf的模板中，模板将标签替换为后端数据，形成最终的html页面，最终通过浏览器渲染出来。

### 准备工作
+ 安装java环境：参考百度
+ 按照mysql：参考百度
+ 安装IntelliJ IDEA：参考百度
+ 安装chrome（可选，建议使用谷歌浏览器）：参考百度

### 一键生成项目代码
spring提供了快速便捷的方式，https://start.spring.io/

#### 相关属性

+ project
（java依赖管理工具）：选择Maven project

+ Language
（开发语言）：Java

+ Spring Boot
（springboot版本）：2.4.5
+ Project Metadata
（项目元数据）：
  | 属性    | 含义    |  示范值  |
    | --------   | -----:   | :----: |
    | group        | 组，一般是组织名或者个人名      |   例如com.alibaba、cn.zhangsan    |
    | artifact        | 项目的标识，英文简称      |   demo    |
    | name        | 项目的名字      |   demo    |
    | description        | 项目的描述      |   Demo  project for Spring Boot    |
  | package name        | 代码包路径，一般格式是group + artifact形式，填写group和artifact后自动生成，一般不需要再修改     |   com.zhangsan.demo    |
  | Java       | java版本，使用稳定版8     |   8   |

#### 确认引入依赖：
+ Spring Web
+ MyBatis Framework 
+ MySQL Driver 
+ Thymeleaf

#### 示范
![image.png](https://upload-images.jianshu.io/upload_images/14105483-7f2c66f9062be083.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### 初始化项目
将下载好的包解压，然后用idea打开项目。一般都能够自动加载（第一次会很慢，耐心等待）

#### 按照分层设计添加代码：

![image.png](https://upload-images.jianshu.io/upload_images/14105483-99ff064b362c5b91.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

 + controller: 
接口声明&控制转发逻辑
+ service：
业务处理逻辑
+ model：
java 实体对象
+ dao：
数据访问层：
用于java对象和数据库表记录之间的转换（包括查询和持久化）
+ resources：
application.properties：项目的配置文件，启动端口、mysql地址信息
static路径：用于存储静态资源，包括js、css、图片等
templates路径：用于存放thymeleaf模板

### 运行：
运行FirstDemoApplication的main方法

输入：http://127.0.0.1:8080/index

![image.png](https://upload-images.jianshu.io/upload_images/14105483-eeb73960018dc9d9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
