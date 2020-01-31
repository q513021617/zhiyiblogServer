<template>
  <div id="app" >

      <!-- <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> -->
       <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
            </li>

            <li class="nav-item has-treeview menu-open">
                <a href="/admin/" class="nav-link active">首页</a>
            </li>

            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>

        <!-- SEARCH FORM -->
        <form class="form-inline ml-3">
            <div class="input-group input-group-sm">
                <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="搜索内容。。。。。">
                <div class="input-group-append">
                    <button class="btn btn-navbar" type="submit">
                        <i class="fas fa-search"></i>
                    </button>
                </div>
            </div>
        </form>

        <!-- Right navbar links -->

    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="#" class="brand-link">
            <img src="/images/logo.gif" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">后台管理</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="/images/avator.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">我叫码云</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul id="navul" class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item has-treeview menu-open ">
                       <router-link to="/home" class="nav-link">
                  
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>
                                首页

                            </p>
                       </router-link>

                    </li>

                    <li class="nav-item">
                      <router-link to="/usermanager" class="nav-link">
                      
                       <i class="nav-icon fas fa-th"></i>
                            <p>
                                用户管理

                            </p>
                      
                      </router-link>
                     
                           
                    
                    </li>
                    <li class="nav-item has-treeview">
                       <router-link to="/articleManage" class="nav-link">
                   
                            <i class="nav-icon fas fa-copy"></i>
                            <p>
                                文章管理


                            </p>
                        </router-link>

                    </li>
                    <li class="nav-item has-treeview">
                       <router-link to="/rolemanager" class="nav-link">
                  
                            <i class="nav-icon fas fa-copy"></i>
                            <p>
                                权限管理


                            </p>
                           </router-link>

                    </li>
                    <li class="nav-item has-treeview">
                       <router-link to="/menumanager" class="nav-link">
                    
                            <i class="nav-icon fas fa-copy"></i>
                            <p>
                                菜单管理


                            </p>
                        </router-link>

                    </li>
                    <li class="nav-item has-treeview">
                        <router-link to="/seomanage" class="nav-link">
                   
                            <i class="nav-icon fas fa-chart-pie"></i>
                            <p>
                                SEO管理

                            </p>
                       </router-link>

                    </li>
                    <li class="nav-item has-treeview">
                      <router-link to="/photomanage" class="nav-link">
                       
                            <i class="nav-icon fas fa-tree"></i>
                            <p>
                                图片管理
                            </p>
                       
                      </router-link>

                    </li>
                    <li class="nav-item has-treeview">

                       <router-link to="/skilltreemanage" class="nav-link">
                       
                            <i class="nav-icon fas fa-edit"></i>
                            <p>
                                技能树管理

                            </p>
                      
                      </router-link>
                      
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-table"></i>
                            <p>
                                退出登录

                            </p>
                        </a>

                    </li>

                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>

   


    <router-view/>




<mainfooter></mainfooter>
  </div>
</template>
<script>

import mainfooter from '@/components/footer.vue'

export default {

  components: {
    mainfooter
  }

}
</script>
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
