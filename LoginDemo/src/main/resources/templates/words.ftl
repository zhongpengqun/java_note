<@override name="content">  
<div style="font-size:200%">
<table width="90%">
<#list wordList as word>
<audio controls>
  <source src="http://dict.youdao.com/dictvoice?audio=good&type=1" type="audio/ogg">
  <source src="http://dict.youdao.com/dictvoice?audio=good&type=1" type="audio/mpeg">
您的浏览器不支持 audio 元素。
</audio>
<tr>
<td>${word.spell}</td>
</tr>
<tr>
<td>${word.pronunciation}</td>
</tr>
<tr>
<td>${word.meaning}</td>
</tr>
<tr>
<td>

<a href="javascript:">test</a>
</td>
</tr>

<td>&nbsp;</td>
<tr>
</tr>

</#list>
</table>
</div>
</@override> 
<@override name="js_block">
<script>
document.querySelector('a').onclick = () => new Audio('http://dict.youdao.com/dictvoice?audio=good&type=1').play()
</script>
</@override>
 
<@extends name="base.ftl"/> 
