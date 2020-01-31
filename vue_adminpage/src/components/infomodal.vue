<template>
<!--  -->
      <div class="modal fade show"  id="modal-default" style="display: block; padding-right: 17px;" aria-modal="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">{{inputtitle}}</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close" @click="closeInfoModel">
                <span aria-hidden="true" >×</span>
              </button>
            </div>
            <div class="modal-body">
                <div v-if="!isinputlist">
                    <p>{{info}}</p>
                </div>
              <div v-if="isinputlist">

                <div v-for="item in infolist" v-bind:key="item.id">
                            <p>显示信息框</p>
                </div>
                    
                </div>


            </div>
            <div class="modal-footer justify-content-between">
              <button type="button" class="btn btn-default" data-dismiss="modal" @click="closeInfoModel">Close</button>
              <button type="button" class="btn btn-primary" @click="okmethod">{{oktext}}</button>
            </div>
          </div>
          <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
      </div>
</template>

<script>

 
    export default {
        
        name:"infomodal",
        
        props:{
            inputtitle:String,
                isinputlist:Boolean,
                info:String,
                infolist:Array,
                oktext:String,
           
        }
        ,methods:{
            closeInfoModel:function () {
                console.log("infomodal内 ---");
                this.$emit('closeInfoModel',false);
            },
            okmethod:function() {
                console.log("infomodal内 ---okmethod");
                this.$emit('okmethod');
            }
        },mounted:function () {
            console.log("组件创建成功!");
        }
        
}
</script>

<style>

</style>