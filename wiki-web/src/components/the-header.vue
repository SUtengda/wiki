<template>
  <a-layout-header class="header">
    <div class="logo" />
    <a-menu
        theme="dark"
        mode="horizontal"
        :style="{ lineHeight: '64px' }"
    >
      <a-menu-item key="home">
        <router-link to="/">Home</router-link>
      </a-menu-item>
      <a-menu-item key="ebook">
        <router-link to="/admin/ebook">Ebooks</router-link>
      </a-menu-item>
      <a-menu-item key="aboutUs">
        <router-link to="/about">About Us</router-link>
      </a-menu-item>
    </a-menu>
  </a-layout-header>

</template>

<script lang="ts">
import {defineComponent} from 'vue';

export default defineComponent({
  name: 'the-header',
});
</script>

<style scoped>

</style>