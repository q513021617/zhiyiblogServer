<template>
  <!-- 个人卡片容器，居中卡片 -->
  <div class="wrapper">
    <!-- 个人卡片 -->
    <div class="profile-card" >
      <!-- 卡片内容，导航，个人简介和工作经历 -->
      <div class="content">
        <!-- 导航 -->
        <nav id="nav-menu">
          <!-- data-rel，在js里获取当前要展示哪个section，是个人简介还是工作经历 -->
          <a
            class="active"
            href="#"
            @click="handleMenuItemClick(0)"
            data-rel="about-me-section"
            >个人简介</a
          >
          <a
            href="#"
            data-rel="work-exp-section"
            @click="handleMenuItemClick(1)">开发经历</a
          >
          <!-- 当前选中菜单的指示条 -->
          <div class="indicator"></div>
        </nav>
        <!-- 关于我部分 -->
        <section class="about-me-section " :class="{'active-section':showTxt==0}" >
          <!-- 名字和身份信息 -->
          <div class="personal-info">
            <div class="title">
              <h1>season</h1>
              <p>java后端工程师/站主</p>
            </div>
            <!-- 关注按钮 -->
            <button class="follow-btn">
              <i class="fas fa-envelope-square"></i>联系我
            </button>
          </div>
          <!-- 个人简介的内容 -->
          <div class="about-me">
            <p>
              我是season，我是一名后端工程师，毕业于四川轻化工大学，软件工程专业。曾在XX公司负责产品后端开发。熟悉使用
              springboot，SSM 开发后端业务模块，也熟悉前端框架VUE。
            </p>
          </div>
          <!-- 社交图标 -->
          <footer>
            <ul>
              <li>
                <a href="#"
                  ><i class="fab fa-weixin"></i
                ></a>
              </li>
              <li>
                <a href="#"
                  ><i class="fab fa-weibo"></i
                ></a>
              </li>
              <li>
                <a href="#"
                  ><i class="fab fa-github"></i
                ></a>
              </li>
              <li>
                <a href="#"
                  ><i
                    class="fab fa-linkedin"
                  ></i
                ></a>
              </li>
            </ul>
          </footer>
        </section>
        <!-- 工作经历部分 -->
        <section class="work-exp-section" :class="{'active-section':showTxt==1}">
          <!-- 工作经历容器 -->
          <div class="work-exps">
            <!-- 每条工作经历 -->
            <div class="work-exp-item">
              <!-- 职位 -->
              <div class="position">
                前端工程师
              </div>
              <!-- 分隔线 -->
              <div class="seperator"></div>
              <!-- 公司信息 -->
              <div class="work-info">
                <!-- 工作时间 -->
                <div class="time">
                  2018.07 ~ 2019.08
                  <i
                    class="far fa-calendar"
                  ></i>
                </div>
                <!-- 公司名称 -->
                <div class="company">
                  北京某某互联网金融公司
                </div>
              </div>
            </div>
            <div class="work-exp-item">
              <div class="position">
                软件工程师
              </div>
              <div class="seperator"></div>
              <div class="work-info">
                <div class="time">
                  2013.07 ~ 2016.07
                  <i
                    class="far fa-calendar"
                  ></i>
                </div>
                <div class="company">
                  北京某美国信息技术公司
                </div>
              </div>
            </div>
            <div class="work-exp-item">
              <div class="position">
                软件工程师
              </div>
              <div class="seperator"></div>
              <div class="work-info">
                <div class="time">
                  2010.07 ~ 2010.12
                  <i
                    class="far fa-calendar"
                  ></i>
                </div>
                <div class="company">
                  北京某大软件有限公司
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
      <!-- 头像 -->
      <aside class="profile-image">
        <img
          src="https://images.pexels.com/photos/1384218/pexels-photo-1384218.jpeg?cs=srgb&dl=man-standing-on-concrete-pavement-near-building-1384218.jpg&fm=jpg"
          alt=""
        />
      </aside>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
        showTxt:0
    }
  },
  methods: {
      // 点击菜单项时的事件处理函数
 handleMenuItemClick:function(index) {
   console.log(index);
   
    this.showTxt=index;
}


  },
  components: {

  },created(){

       // 获取导航菜单项
const navMenuItems = document.querySelectorAll("#nav-menu a");
// 获取指示条实例，用来做动画
const indicator = document.querySelector(".indicator");
var _this=this;

navMenuItems.forEach(item => {
  // 每个菜单项点击时调用事件处理函数
  item.addEventListener("click", e => _this.handleMenuItemClick(e.target));

  // 首次页面展示时，工作简介菜单是active的，先触发一次点击处理
  item.classList.contains("active") && _this.handleMenuItemClick(item);
});



  }
}
</script>

<style>
@import url("https://fonts.googleapis.com/css?family=Raleway&display=swap");

:root {
  /* 主蓝色，按钮，社交图标 */
  --primary-color: #71b3dd;
  /* 主蓝色，深，导航 */
  --primary-dark-color: #4489b5;
  --text-color-gray: #8b979f;
  --text-color-light-gray: #c1c7cb;
  --text-color-dark-gray: #5a6f7c;
}

* {
  margin: 0;
  padding: 0;
  font-size: 14px;
  box-sizing: border-box;
  font-family: "Raleway", "PingFang SC",
    "Microsoft Yahei", sans-serif;
}

.wrapper {
  /* 栅格布局，居中卡片 */
  display: grid;
  align-items: center;
  justify-content: center;
  height: 100vh;
}

.profile-card {
  display: grid;
  /* 12格栅格 */
  grid-template-columns: repeat(12, 1fr);
  /* 每个列之间的空隙是12px */
  column-gap: 12px;
  /* 卡片总宽度为627px */
  width: 1027px;
  /* 卡片总高度为374px */
  height: 674px;
  box-shadow: 0px 0px 22px 3px rgba(0, 0, 0, 0.18);
}

.profile-image {
  /* 图片占5列 */
  grid-column: 8 / 13;
  max-width: 238px;
  height: 100%;
  /* 隐藏图片超出区域 */
  overflow: hidden;
  /* 垂直为靠上对齐 */
  align-self: start;
  /* 水平为靠右对齐 */
  justify-self: end;
}

.profile-image img {
  /* 图片放大，然后只显示一部分 */
  width: 210%;
  transform: translate(-205px, -280px);
  object-fit: cover;
}

.content {
  /* 左边内容占7列 */
  grid-column: 1 / 8;
  padding: 38px 28px 20px 33px;
  position: relative;
}

nav {
  margin-bottom: 24px;
  display: flex;
  position: relative;
}

nav a {
  color: var(--text-color-gray);
  text-decoration: none;
}

nav a.active {
  color: var(--primary-dark-color);
}

nav a:not(:last-child) {
  margin-right: 40px;
}

nav .indicator {
  height: 2px;
  background: var(--primary-dark-color);
  bottom: -7px;
  left: 0;
  position: absolute;
  transition: 0.4s;
}

.content section {
  /* 堆叠个人简介和工作经历部分 */
  position: absolute;
  /* 默认都不显示  */
  opacity: 0;
  /* 淡出淡入效果 */
  transition: 0.3s ease-out;
}

.content section.active-section {
  /* 显示active-section */
  opacity: 1;
}

/* 名字、身份与关注按钮左右布局，各占一列，子栅格不受父栅格影响，是个全新的栅格布局 */
.personal-info {
  display: grid;
  grid-template-columns: 1fr 1fr;
}
/* 名字 */
.title h1 {
  font-size: 2em;
  font-weight: 500;
}
/* 身份 */
.title p {
  color: var(--text-color-gray);
  font-size: 1em;
  margin: 6px 0 18px 0;
}

/* 关注按钮 */
.follow-btn {
  justify-self: end;
  height: 30px;
  background: var(--primary-color);
  border: none;
  color: white;
  padding: 0 27px;
  border-radius: 4px;
  display: flex;
  align-items: center;
  justify-content: center;
  line-height: 30px;
}

/* 关注按钮的加号 */
.follow-btn .fas {
  font-size: 10px;
  margin-right: 6px;
}

/* 关于我部分 */
.about-me {
  color: var(--text-color-dark-gray);
  font-weight: 300;
  text-align: justify;
}

/* 社交按钮部分 */
footer {
  margin-top: 370px;
}

footer ul {
  display: flex;
}

footer ul li {
  list-style: none;
}

footer ul li:not(:last-child) {
  margin-right: 30px;
}

footer .fab {
  color: var(--primary-color);
  font-size: 24px;
}
/* ********************************* */

/* 工作经历，一共3条工作经历，所以创建了3行栅格布局 */
.work-exps {
  color: var(--text-color-gray);
  display: grid;
  grid-template-rows: repeat(
    3,
    minmax(80px, auto)
  );
}

/* 每个工作经历为三列栅格布局，分别为职位，分隔线、公司名和工作时间部分 */
.work-exp-item {
  display: grid;
  /* 列之间的比例 */
  grid-template-columns: 5fr 1fr 7fr;
  align-items: center;
  justify-content: center;
}

/* 职位 */
.position {
  font-size: 18px;
  font-weight: 500;
}
/* 分隔线 */
.seperator {
  height: 43px;
  /* width: 1px; */
  border-left: 2px dotted #eaeff2;
}

/* 工作时间 */
.time {
  color: var(--text-color-light-gray);
}

/* 公司 */
.company {
  font-size: 14px;
  color: var(--text-color-dark-gray);
  margin-top: 9px;
}

</style>


