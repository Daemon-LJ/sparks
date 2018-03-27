---------------------------------------
# [项目介绍] 
> 这是我的第一个自己的维护的项目。初步打算当做管理类型项目的模板。
# [开发者] 
> daemon 
# [项目包路径]
java  
|-- common   _（公共类）_  
|&emsp;&emsp;|-- conf       _（配置类）_  
|&emsp;&emsp;|-- constant   _（业务字典;类名参照xxConstant）_  
|&emsp;&emsp;|-- exception  _（业务异常;类名参照xxException）_   
|&emsp;&emsp;|-- util       _（业务工具类;类名参照xxUtil）_   
|&emsp;&emsp;|-- job        _（定时任务;类名参照xxjob）_    
|-- dao      _（序列化层）_  
|&emsp;&emsp;|-- model      _（实体类）_    
|&emsp;&emsp;|-- mapper     _（接口;类名参照xxMapper）_    
|-- service  _（业务层）_  
|&emsp;&emsp;|-- bo         _（业务实体;类名参照xxBo）_    
|&emsp;&emsp;|-- impl       _（业务实现;类名参照xximpl）_    
|&emsp;&emsp;|-- monitor    _（监听事件;类名参照xxEvent;xxListener）_     
|-- web      _（控制层）_  
&emsp;&emsp;|-- api         _（dubbo实现，远程调用层;类名参照xxaction）_         
&emsp;&emsp;|-- controller  _（http请求;类名参照xxController）_    
&emsp;&emsp;|-- filter      _（过滤器;类名参照xxFilter）_  
resources  
|-- mapper  _（mapper文件）_   
|-- static  _（静态文件）_  
# [开发约定&&代码规范]
1. 平时写代码，在选择枚举和常量时一定要想清楚，避免后面二次改，浪费时间和精力。
2. 写代码时一定要准备好单元测试，方便调试和追查问题。
3. 写代码时一定要加好注释和日志，不要想着在走查时再加。
4. controller，service方法都要求有注释.  基本元素有功能说明、URL、参数、返回值、异常、备注。
5. 使用findBugs进行代码检查。
6. 学习使用idea，自动组织和检查代码。
# [历史提交轨迹]
* 完成README.MD的模板制作
* markdown在IDEA中如何完成预览
* 添加gradle、spring boot、spring的框架
* 添加包结构目录的构建
* 完成mybatis与spring的整合。  
**** 完成自动生成框架rp-genera的加入。  
**** 完成markdown的学习以及整理，整理好README.md文件。  
**** 完成git的整理和使用场景综合整理。  