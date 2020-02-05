
<template>
   <div class="card-footer clearfix">

                    <ul class="pagination pagination-sm m-0 float-right">
                      <li class="page-item"><a class="page-link" href="#" @click="prepage">«</a></li>
                      <div v-if="tatolpage<=5 ">
                            <li class="page-item" v-for="(index,pageitem) in tatolpage"  v-bind:Key="index"><a class="page-link" href="#" @click="querybypage(pageitem)" >{{pageitem}}</a></li>
                      </div>
                      
                      <div v-if=" index <= 2 && tatolpage>5 ">
                          <li class="page-item"  v-for="(index,pageitem) in tatolpage"  v-bind:Key="index"><a class="page-link" href="#" @click="querybypage(index)" >{{index}}</a></li>
                      
                      </div>

                   <div v-if=" (index> 2 && index < tatolpage - 1) && tatolpage > 5 " > 
                    <li class="page-item" v-for="(index,pageitem) in tatolpage"  v-bind:Key="index"><a  href="#" :class="pageitem==curpage?'page-link':''" @click="querybypage(index)">{{index==curpage?index:'.'}}</a></li>
                      
                   </div>
                     
                     <div v-if="index >= tatolpage -1  && tatolpage > 5 ">
                            <li class="page-item"  v-for="(index,pageitem) in tatolpage"  v-bind:Key="index"><a class="page-link" href="#" @click="querybypage(index)" >{{index}}</a></li>
                     
                     </div>
                    
                    
                      <li class="page-item"><a class="page-link" href="#" @click="nextpage">»</a></li>
                    </ul>

                  </div>
</template>

<script>

       export default {
        
        name:"pagehelper",
   
        props:{
            inputtitle:String,
                isinputlist:Boolean,
                isimglist:Boolean,
                isimg:Boolean,
                info:String,
    
                infolist:Array,
                oktext:String,
           
        }
        ,methods:{

        },created:function(){
        
          // this.infostring=this.parseDom(this.info);

        },mounted:function () {
          
            console.log("pagehelper---组件创建成功!");

        }
}
</script>

<style>

</style>