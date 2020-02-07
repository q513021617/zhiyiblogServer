<template>
  <div >
    <div class="contaner-fluid" style="height:399px;">
     <canvas id="canv" class="p5Canvas" width="100%" height="100%" style="width: 100%; height: 100%;"></canvas>
</div>
<!-- そばにいるね 背景音乐 -->
<div id="service" class="container">
    <div class="area_title">
        <h2>我的开源项目</h2>
        <p>My github</p>
        <ul class="service_list">
            <li>
                <!-- 102 -->
            
                 
                <a href="https://github.com/q513021617/zhiyiCMS"><div></div></a>
                <h3>1,zhiyiCMS</h3>
                <p>基于springboot和VUE开发的一款通用
                    <br>后台管理系统</p>
            </li>

            <li>
                  <a href="https://github.com/q513021617/zhiyiblog"><div></div></a>
                <h3>2,zhiyiblog</h3>
                <p>基于zhiyiCMS开发的一款个人
                    <br>博客主页</p>
            </li>

            <li>
                <a href="#"><div></div></a>
                <h3>3,在线考试系统</h3>
                <p>基于SSM框架开发的考试系统
                    <br>考试系统</p>
            </li>
            <li>
                 <a href="#"><div></div></a>
                <h3>4,冲关答题系统</h3>
                <p>支持手机端，PC端的
                    <br>答题系统</p>
            </li>
        </ul>
    </div>

</div>

<div id="news" class="container" style="position:absolute;">

    <div class="area_title">
       
        <h2>最新文章</h2>
        <p>THE LATEST ArticleS</p>
    </div>

    <dl>

        <dt class="leftfloat">
            <img src="/images/address.gif" alt="">
        </dt>
        <dd class="leftfloat">

            <ul class="new_list">
                <li>

                    <div class="new_date leftfloat">
                        <i>09</i>
                        <span>Jan</span>
                        <div class="new_text leftfloat">
                            <h3> <router-link to="/articleDetail">测试内容测试内容</router-link></h3>
                            <p>测试内容测试内容测试内容测试内容测试内容测试内容....</p>
                        </div>
                    </div>
                </li>

                <li>

                    <div class="new_date leftfloat">
                        <i>09</i>
                        <span>Jan</span>
                        <div class="new_text leftfloat">
                             <h3> <router-link to="/articleDetail">测试内容测试内容</router-link></h3>
                            <p>测试内容测试内容测试内容测试内容测试内容测试内容....</p>
                        </div>
                    </div>
                </li>
                <li>

                    <div class="new_date leftfloat">
                        <i>09</i>
                        <span>Jan</span>
                        <div class="new_text leftfloat">
                            <h3> <router-link to="/articleDetail">测试内容测试内容</router-link></h3>
                            <p>测试内容测试内容测试内容测试内容测试内容测试内容....</p>
                        </div>
                    </div>
                </li>

                <li>

                    <div class="new_date leftfloat">
                        <i>09</i>
                        <span>Jan</span>
                        <div class="new_text leftfloat">
                             <h3> <router-link to="/articleDetail">测试内容测试内容</router-link></h3>
                            <p>测试内容测试内容测试内容测试内容测试内容测试内容....</p>
                        </div>
                    </div>
                </li>
            </ul>
        </dd>
    </dl>
</div>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import bannermethods from'@/cavastool/bannerscript.js'

function Part() {
  this.deg = 0;
  this.rad = 0;
  this.x = 0;
  this.y = 0;
  this.distX = 0;
  this.distY = 0;
  this.color = 'rgb(' + Math.floor(Math.random() * 130) + ',' + Math.floor(Math.random() * 50) + ',' + Math.floor(Math.random() * 100) + ')';
  this.size;
}

export default {
  name: 'home',
  components: {
    HelloWorld
  },mounted(){
    //   console.log("----mounted----");
       bannermethods.start();
  },created(){
       
  }
}
</script>
