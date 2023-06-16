<template>
  <div class="app-container">
    <el-card>
      <div slot="header" class="clearfix">
        <span>统计面板</span>
      </div>
      <el-tabs v-model="activeTab">
        <el-tab-pane label="今日统计" name="day">
          <div>
            <el-row :gutter="10">
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.daySum" title="今日总支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.dayMax" title="今日单次最大支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.dayMin" title="今日单次最小支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :precision="2" :value="moneyNoteStat.dayAvg" title="今日平均单次支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.dayCount" title="今日总支出笔数"></el-statistic></div></el-col>
            </el-row>
          </div>
        </el-tab-pane>

        <el-tab-pane label="本周统计" name="week">
          <div>
            <el-row :gutter="10">
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.weekSum" title="周度总支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.weekMax" title="周度单次最大支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.weekMin" title="周度单次最小支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :precision="2" :value="moneyNoteStat.weekAvg" title="周度平均单次支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.weekCount" title="周度总支出笔数"></el-statistic></div></el-col>
            </el-row>
          </div>
        </el-tab-pane>

        <el-tab-pane label="本月统计" name="month">
          <div>
            <el-row :gutter="10">
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.monthSum" title="月度总支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.monthMax" title="月度单次最大支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.monthMin" title="月度单次最小支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :precision="2" :value="moneyNoteStat.monthAvg" title="月度平均单次支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.monthCount" title="月度总支出笔数"></el-statistic></div></el-col>
            </el-row>
          </div>
        </el-tab-pane>

        <el-tab-pane label="本年统计" name="year">
          <div>
            <el-row :gutter="10">
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.yearSum" title="年度总支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.yearMax" title="年度单次最大支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.yearMin" title="年度单次最小支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :precision="2" :value="moneyNoteStat.yearAvg" title="年度平均单次支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.yearCount" title="年度总支出笔数"></el-statistic></div></el-col>
            </el-row>
          </div>
        </el-tab-pane>

        <el-tab-pane label="历史统计" name="all">
          <div>
            <el-row :gutter="10">
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.allSum" title="历史总支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.allMax" title="历史单次最大支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.allMin" title="历史单次最小支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :precision="2" :value="moneyNoteStat.allAvg" title="历史平均单次支出"></el-statistic></div></el-col>
              <el-col :span="4"><div><el-statistic group-separator="," :value="moneyNoteStat.allCount" title="历史总支出笔数"></el-statistic></div></el-col>
            </el-row>
          </div>
        </el-tab-pane>

      </el-tabs>
    </el-card>

    <br>
    <el-card>
      <div slot="header" class="clearfix">
        <span>搜索面板</span>
      </div>
      <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
        <el-form-item label="金额" prop="amount">
          <el-input
            v-model="queryParams.amount"
            placeholder="请输入金额"
            clearable
            @keyup.enter.native="handleQuery"
          />
        </el-form-item>
        <el-form-item label="分类" prop="category">
          <el-select v-model="queryParams.category" placeholder="请选择分类" clearable>
            <el-option
              v-for="dict in dict.type.panda_moneynote_category"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            />
          </el-select>
        </el-form-item>

        <!--      <el-form-item label="消费时间" prop="custTime">-->
        <!--        <el-date-picker clearable-->
        <!--          v-model="queryParams.custTime"-->
        <!--          type="date"-->
        <!--          value-format="yyyy-MM-dd"-->
        <!--          placeholder="请选择消费时间">-->
        <!--        </el-date-picker>-->
        <!--      </el-form-item>-->

        <el-form-item label="起始时间">
          <el-date-picker clearable
                          v-model="queryParams.params.startTime"
                          type="date"
                          value-format="yyyy-MM-dd"
                          placeholder="请选择起始时间">
          </el-date-picker>
        </el-form-item>

        <el-form-item label="终了时间">
          <el-date-picker clearable
                          v-model="queryParams.params.endTime"
                          type="date"
                          value-format="yyyy-MM-dd"
                          placeholder="请选择终了时间">
          </el-date-picker>
        </el-form-item>

        <el-form-item label="支付方式" prop="payType">
          <el-select v-model="queryParams.payType" placeholder="请选择支付方式" clearable>
            <el-option
              v-for="dict in dict.type.panda_moneynote_paytype"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            />
          </el-select>
        </el-form-item>
        <el-form-item label="收支" prop="inOut">
          <el-select v-model="queryParams.inOut" placeholder="请选择收支" clearable>
            <el-option
              v-for="dict in dict.type.panda_moneynote_inout"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            />
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
          <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
        </el-form-item>
      </el-form>
    </el-card>

    <br>
    <el-card>
      <div slot="header" class="clearfix">
        <span>操作面板</span>
      </div>
      <el-row :gutter="10" class="mb8">
        <el-col :span="1.5">
          <el-button
            type="primary"
            plain
            icon="el-icon-plus"
            size="mini"
            @click="handleAdd"
            v-hasPermi="['panda:moneynote:add']"
          >新增</el-button>
        </el-col>
        <el-col :span="1.5">
          <el-button
            type="success"
            plain
            icon="el-icon-edit"
            size="mini"
            :disabled="single"
            @click="handleUpdate"
            v-hasPermi="['panda:moneynote:edit']"
          >修改</el-button>
        </el-col>
        <el-col :span="1.5">
          <el-button
            type="danger"
            plain
            icon="el-icon-delete"
            size="mini"
            :disabled="multiple"
            @click="handleDelete"
            v-hasPermi="['panda:moneynote:remove']"
          >删除</el-button>
        </el-col>
        <el-col :span="1.5">
          <el-button
            type="warning"
            plain
            icon="el-icon-download"
            size="mini"
            @click="handleExport"
            v-hasPermi="['panda:moneynote:export']"
          >导出</el-button>
        </el-col>
        <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
      </el-row>
    </el-card>
    <br>

    <!--    列表显示-->
    <el-table v-loading="loading" :data="moneynoteList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />

      <el-table-column label="ID" align="center" prop="id" />

      <el-table-column label="金额" align="center" prop="amount" />

      <el-table-column label="备注" align="center" prop="remark" />

      <el-table-column label="分类" align="center" prop="category">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.panda_moneynote_category" :value="scope.row.category"/>
        </template>
      </el-table-column>

      <el-table-column label="消费时间" align="center" prop="custTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.custTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="支付方式" align="center" prop="payType">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.panda_moneynote_paytype" :value="scope.row.payType"/>
        </template>
      </el-table-column>

      <el-table-column label="收支" align="center" prop="inOut">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.panda_moneynote_inout" :value="scope.row.inOut"/>
        </template>
      </el-table-column>

      <el-table-column label="创建者" align="center" prop="params.createBy" />

      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['panda:moneynote:edit']"
          >修改</el-button>

          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['panda:moneynote:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改熊猫记账对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="700px" append-to-body :close-on-click-modal="false" :close-on-press-escape="false">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-form-item label="金额" prop="amount">
          <el-input v-model="form.amount" placeholder="请输入金额" />
        </el-form-item>

        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>

        <el-form-item label="分类" prop="category">
          <el-select v-model="form.category" placeholder="请选择分类">
            <el-option
              v-for="dict in dict.type.panda_moneynote_category"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="消费时间" prop="custTime">
<!--          <el-date-picker clearable-->
<!--            v-model="form.custTime"-->
<!--            type="date"-->
<!--            value-format="yyyy-MM-dd HH:mm:ss"-->
<!--            placeholder="请选择消费时间">-->
<!--          </el-date-picker>-->
          <el-date-picker
            v-model="form.custTime"
            type="datetime"
            placeholder="消费时间"
            value-format="yyyy-MM-dd HH:mm:ss"
            format="yyyy-MM-dd HH:mm:ss"
            :default-value="new Date()"
            default-time="12:00:00">
          </el-date-picker>
        </el-form-item>

        <el-form-item label="支付方式" prop="payType">
          <el-select v-model="form.payType" placeholder="请选择支付方式">
            <el-option
              v-for="dict in dict.type.panda_moneynote_paytype"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="收支" prop="inOut">
          <el-select v-model="form.inOut" placeholder="请选择收支">
            <el-option
              v-for="dict in dict.type.panda_moneynote_inout"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>

        <el-divider content-position="center">图片信息</el-divider>

<!--        <el-row :gutter="10" class="mb8">-->
<!--          <el-col :span="1.5">-->
<!--            <el-button type="primary" icon="el-icon-plus" size="mini" @click="handleAddImage">添加</el-button>-->
<!--          </el-col>-->
<!--          <el-col :span="1.5">-->
<!--            <el-button type="danger" icon="el-icon-delete" size="mini" @click="handleDeleteImage">删除</el-button>-->
<!--          </el-col>-->
<!--        </el-row>-->

<!--        <el-table :data="imageList" :row-class-name="rowImageIndex" @selection-change="handleImageSelectionChange" ref="image">-->
<!--          <el-table-column type="selection" width="50" align="center" />-->
<!--          <el-table-column label="序号" align="center" prop="index" width="50"/>-->
<!--          <el-table-column label="图片目标分类" prop="parentType" width="150">-->
<!--            <template slot-scope="scope">-->
<!--&lt;!&ndash;              <el-select v-model="scope.row.parentType" placeholder="请选择图片目标分类">&ndash;&gt;-->
<!--&lt;!&ndash;                <el-option label="请选择字典生成" value="" />&ndash;&gt;-->
<!--&lt;!&ndash;              </el-select>&ndash;&gt;-->
<!--              <el-image :src="scope.row.imageUrl">-->
<!--                <div slot="placeholder" class="image-slot">-->
<!--                  加载中<span class="dot">...</span>-->
<!--                </div>-->
<!--              </el-image>-->
<!--            </template>-->
<!--          </el-table-column>-->
<!--        </el-table>-->

        <el-form-item label="图片列表" prop="imageUrls">
          <image-upload v-model="imageUrls"/>
        </el-form-item>
<!--        <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">-->
<!--          <el-form-item label="选择图片" prop="imageList" required>-->
<!--            <el-upload ref="imageList" :file-list="imageListfileList" :action="imageListAction" multiple-->
<!--                       :before-upload="imageListBeforeUpload" list-type="picture-card" accept="image/*">-->
<!--              <i class="el-icon-plus"></i>-->
<!--              <div slot="tip" class="el-upload__tip">只能上传不超过 5MB 的image/*文件</div>-->
<!--            </el-upload>-->
<!--          </el-form-item>-->
<!--          <el-form-item size="large">-->
<!--            <el-button type="primary" @click="submitForm1">提交</el-button>-->
<!--            <el-button @click="resetForm">重置</el-button>-->
<!--          </el-form-item>-->
<!--        </el-form>-->

      </el-form>

      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { getMoneyNoteStat,listMoneynote, getMoneynote, delMoneynote, addMoneynote, updateMoneynote } from "@/api/panda/moneynote";

export default {
  name: "Moneynote",
  dicts: ['panda_moneynote_inout', 'panda_moneynote_paytype', 'panda_moneynote_category'],
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 子表选中数据
      checkedImage: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 熊猫记账表格数据
      moneynoteList: [],
      // 图片表格数据
      imageList: [],
      imageUrls: "",
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        amount: null,
        category: null,
        custTime: null,
        payType: null,
        inOut: null,
        remark: null,
        params: {
          startTime:null,
          endTime:null
        },
      },
      //统计信息
      moneyNoteStat:{},
      //当前激活的时间周期面板
      activeTab: "day",
      // 表单参数
      form: {
        custTime: null
      },
      // 表单校验
      rules: {
        amount: [
          { required: true, message: "金额不能为空", trigger: "blur" }
        ],
        custTime: [
          { required: true, message: "消费时间不能为空", trigger: "blur" }
        ],
        inOut: [
          { required: true, message: "收支不能为空", trigger: "change" }
        ],
      }
    };
  },
  created() {
    this.getMoneyNoteStat();
    this.getList();
  },
  mounted() {

  },
  methods: {
    /** 获取统计信息 */
    getMoneyNoteStat() {
      this.loading = true;
      getMoneyNoteStat().then(response => {
        console.log(response.data);
        this.moneyNoteStat = response.data;
        this.loading = false;
      });
    },
    /** 查询熊猫记账列表 */
    getList() {
      this.loading = true;
      listMoneynote(this.queryParams).then(response => {
        this.moneynoteList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        amount: null,
        category: null,
        custTime: null,
        payType: null,
        inOut: null,
        remark: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null,
        params:{
          startTime: null,
          endTime: null
        }
      };
      this.imageList = [];
      this.imageUrls = "";
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getMoneyNoteStat();
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.form = {
        category: 1,
        // custTime: new Date().toLocaleString(),
        payType: 2,
        inOut: -1
      };
      this.open = true;
      this.title = "添加熊猫记账";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getMoneynote(id).then(response => {
        this.form = response.data;
        this.imageList = response.data.imageList;
        if (this.imageList){
          this.imageUrls = this.imageList.map(image=>image.imageUrl).join(",");
        }
        this.open = true;
        this.title = "修改熊猫记账";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.imageUrls){
            this.form.imageList=[];
            this.imageUrls.split(",").forEach(e=>{
              this.form.imageList.push({"imageUrl":e});
            });
          }
          if (this.form.id != null) {
            updateMoneynote(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getMoneyNoteStat();
              this.getList();
            });
          } else {
            addMoneynote(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getMoneyNoteStat();
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除熊猫记账编号为"' + ids + '"的数据项？').then(function() {
        return delMoneynote(ids);
      }).then(() => {
        this.getMoneyNoteStat();
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
	/** 图片序号 */
    rowImageIndex({ row, rowIndex }) {
      row.index = rowIndex + 1;
    },
    /** 图片添加按钮操作 */
    handleAddImage() {
      let obj = {};
      obj.parentType = "";
      obj.imageUrl = "";
      this.imageList.push(obj);
    },
    /** 图片删除按钮操作 */
    handleDeleteImage() {
      if (this.checkedImage.length == 0) {
        this.$modal.msgError("请先选择要删除的图片数据");
      } else {
        const imageList = this.imageList;
        const checkedImage = this.checkedImage;
        this.imageList = imageList.filter(function(item) {
          return checkedImage.indexOf(item.index) == -1
        });
      }
    },
    /** 复选框选中数据 */
    handleImageSelectionChange(selection) {
      this.checkedImage = selection.map(item => item.index)
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('panda/moneynote/export', {
        ...this.queryParams
      }, `moneynote_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
<style>
  .el-upload__tip {
    line-height: 1.2;
  }

</style>
