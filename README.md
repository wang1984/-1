# shopping-object1
1、项目描述：

        是一个综合性的B2C平台，类似京东。该项目采用分布式系统架构，按照功能点把系统拆分，拆分成独立的功能。子系统之间都是调用服务来实现系统之间的通信，使用http协议传递json数据方式实现。降低了系统之间的耦合度，提高了系统的扩展性。为了提高系统的性能使用redis做系统缓存，并使用redis实现session共享。为了保证redis的性能使用redis的集群。搜索功能使用solrCloud做搜索引擎。

2、主要技术：

        Spring、SpringMVC、Mybatis、JSP、JSTL、jQuery、KindEditor（富文本编辑器）、Redis（缓存服务器）、Solr（搜索）、httpclient（调用系统服务）、Mysql、Nginx（web服务器）

3、开发工具和环境：

        Eclipse、Maven 、Tomcat 7、JDK 1.7、Mysql 、Nginx、Redis 、Win7 、SVN

4、系统模块

          1）后台管理系统：管理商品、订单、类目、商品规格属性、内容发布等功能。

          2）前台系统：用户可以在前台系统中进行注册、登录、浏览商品、首页、下单等操作。

         3）订单系统：提供下单、查询订单。

         4）搜索系统：提供商品的搜索功能。

         5）单点登录系统：为多个系统之间提供用户登录凭证以及查询登录用户的信息。

