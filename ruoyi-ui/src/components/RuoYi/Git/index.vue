<template>
  <div>
    <svg-icon icon-class="github" @click="goto" />
  </div>
</template>

<script>
export default {
  name: 'JpandaGit',
  data() {
    return {
      url: 'https://github.com/Java-panda'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>
