<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <div class="container-xxl">
        <table class="table table-dark table-striped">
          <tr>
            <td>Java Route</td>
            <td><a href="https://www.processon.com/view/link/617be37ee0b34d7894fcf545#map"
                   class="link-success" target="_blank"><img alt="Java Route"
                                                             src="images/runoob.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Pdai</td>
            <td><a href="https://pdai.tech/"
                   class="link-success" target="_blank"><img alt="Pdai"
                                                             src="images/pdai.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Runoob</td>
            <td><a href="https://www.runoob.com/"
                   class="link-success" target="_blank"><img alt="runoob"
                                                             src="images/runoob.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Mybatis</td>
            <td><a href="https://mybatis.org/mybatis-3/zh/index.html"
                   class="link-success" target="_blank"><img alt="Mybatis"
                                                             src="images/mybatis-logo.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>GitHub</td>
            <td><a href="https://github.com/Java-panda"
                   class="link-success" target="_blank"><img alt="Git Hub"
                                                             src="images/github.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>StackOverFlow</td>
            <td><a href="https://stackoverflow.com/"
                   class="link-success" target="_blank"><img alt="stackoverflow"
                                                             src="images/stackoverflow.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>GitLab</td>
            <td><a href="https://about.gitlab.com/"
                   class="link-success" target="_blank"><img alt="gitlab"
                                                             src="images/gitlab.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Thymeleaf</td>
            <td><a href="https://www.thymeleaf.org/"
                   class="link-success" target="_blank"><img alt="Thymeleaf"
                                                             src="images/Thymeleaf.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Data Structure Visualizations</td>
            <td><a href="https://www.cs.usfca.edu/~galles/visualization/Algorithms.html"
                   class="link-success" target="_blank"><img alt="Data Structure Visualizations"
                                                             src="images/DataStructureVisualizations.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Spring Boot</td>
            <td><a href="https://spring.io/projects/spring-boot"
                   class="link-success" target="_blank"><img alt="Spring Boot"
                                                             src="images/SpringBoot.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Regular Express</td>
            <td><a href="https://regex101.com/"
                   class="link-success" target="_blank"><img alt="Regular Express"
                                                             src="images/RegularExpress.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>ServiceNow</td>
            <td><a href="https://developer.servicenow.com/dev.do"
                   class="link-success" target="_blank"><img alt="ServiceNow"
                                                             src="images/servicenow.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Lightning Design System</td>
            <td><a href="https://www.lightningdesignsystem.com/"
                   class="link-success" target="_blank"><img alt="Lightning Design System"
                                                             src="images/LightningDesignSystem.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>WorkBench</td>
            <td><a href="https://workbench.developerforce.com/login.php?startUrl=%2Fexecute.php"
                   class="link-success" target="_blank"><img alt="WorkBench"
                                                             src="images/LightningDesignSystem.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>LWC</td>
            <td><a href="https://developer.salesforce.com/docs/component-library/documentation/en/lwc/lwc.get_started_introduction"
                   class="link-success" target="_blank"><img alt="LWC"
                                                             src="images/LightningDesignSystem.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>Apex</td>
            <td><a href="https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_dev_guide.htm"
                   class="link-success" target="_blank"><img alt="Apex"
                                                             src="images/LightningDesignSystem.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>SOQL</td>
            <td><a href="https://developer.salesforce.com/docs/atlas.en-us.soql_sosl.meta/soql_sosl/sforce_api_calls_soql.htm"
                   class="link-success" target="_blank"><img alt="SOQL"
                                                             src="images/LightningDesignSystem.png" width="100" height="62"></a></td>
          </tr>
          <tr>
            <td>WebTools</td>
            <td><a href="https://tm-webtools.com/"
                   class="link-success" target="_blank"><img alt="WebTools"
                                                             src="images/WebTools.png" width="100" height="62"></a></td>
          </tr>
        </table>
      </div>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.6.2",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
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

