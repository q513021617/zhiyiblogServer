<template>

  <div id="app">
  <div id="head" class="container">
    <div class="head_logo leftfloat">
        <a href="#">
            <img src="/images/logo.gif" alt="" title="" />
        </a>

    </div>

    <ul class="head_menu rightfloat">
        <li>
 <!-- class="active" -->
             <router-link to="/" > 首页 </router-link>
        </li>
        <li>

            <router-link to="/aboutMe"> 关于我 </router-link>
        </li>
        
        <li>

    
            <router-link to="/articleList">文章列表 </router-link>
        </li>

       <div class="head_userstatus rightfloat">
           <a href="login.html" style="display:inner-block;"> 登录/注册 </a> 
           <a href="#" style="display:none;"> 用户:123123213 </a> 
        
        </div>
       
    </ul>

    
    
</div>

<router-view></router-view>


 <div id="foot" class="container-fluid" >
   
        <div id="container">
            <p class="leftfloat">Copyright 2018-2020 Zhiyigo.cn culture All Rights Reserved<a href="http://beian.miit.gov.cn">蜀ICP备20002097号</a></p>
            <div class="rightfloat">

                <router-link to="/">首页 </router-link>| <router-link to="/aboutme">关于我 </router-link> |  <router-link to="/">文章列表 </router-link>
            </div>
        </div>
</div>

  </div>

</template>

<script>

// import 'bootstrap/dist/css/bootstrap.min.css'
// import 'bootstrap/dist/js/bootstrap.min.js'


export default {
  name: 'app',
  components: {
    
  },created:function(){

    
        

  },mounted(){
      console.log("----mounted----");
        
  }
}
</script>

<style>
  
canvas {  margin: auto;  touch-action: none; }
body{position:relative;}
</style>
