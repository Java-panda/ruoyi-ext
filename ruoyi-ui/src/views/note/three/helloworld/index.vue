<template>
  <div class="app-container home" id="container">
    Three
  </div>
</template>

<script>
import {
  BoxBufferGeometry,
  Color,
  Mesh,
  MeshBasicMaterial,
  PerspectiveCamera,
  SphereGeometry,
  OrthographicCamera,
  MeshLambertMaterial,
  Scene,
  PointLight,
  AmbientLight,
  WebGLRenderer
} from 'three'

export default {
  name: 'Index',
  data() {
    return {
      // 版本号
      version: '3.6.2',
      camera: null,  //相机对象
      scene: null,  //场景对象
      renderer: null,  //渲染器对象
      mesh: null  //网格模型对象Mesh
    }

  },
  created() {
    console.log('Main ...')
  },
  mounted() {
    this.init()
  },
  methods: {
    init() {
      // 初始化准备
      const container = document.querySelector('#container')

      // 创建场景
      const scene = new Scene()

      // 设置场景背景色
      scene.background = new Color('green')

      // 创建相机
      // 视野：相机的视野有多宽，以度为单位。
      const fov = 35
      // 纵横比：场景的宽度与高度的比率。
      const aspect = container.clientWidth / container.clientHeight
      // 近剪裁平面：任何比这更靠近相机的东西都是不可见的。
      const near = 0.1
      // 远剪裁平面：任何比这更远离相机的东西都是不可见的。
      const far = 100
      const camera = new PerspectiveCamera(fov, aspect, near, far)

      // 相机定位，z轴正上方
      camera.position.set(0, 0, 10)

      // 绘制立方体
      const geometry = new BoxBufferGeometry(1, 1, 1)

      // 创建材质
      const material = new MeshBasicMaterial()

      // 网格化
      const cube = new Mesh(geometry, material)

      // 将立方体加入到场景
      scene.add(cube)

      // 创建渲染器
      const renderer = new WebGLRenderer()

      //
      renderer.setSize(container.clientWidth, container.clientHeight)

      //
      renderer.setPixelRatio(window.devicePixelRatio)

      // 元素添加
      container.append(renderer.domElement)

      // 渲染
      renderer.render(scene, camera)

    },
    goTarget(href) {
      window.open(href, '_blank')
    }
  }
}

</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

