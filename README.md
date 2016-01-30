# Kit
###A UI and Utils Base module to be used in all future projects

##Why did I make this?
Like anyone other android developer, I found my self copy and pasting commonly used classes and xml files back and forth whenever I started new projects. So I said to myself that I might as well make an organized library of UI elements, boilerplate xml, and util classes that I can use on any future projects.

##Installation
1. Clone or copy the `kit` folder into the root folder of your project, inline with your `app` folder.
2. In Android Studio, go to `Project Structure > App Name > Dependencies > Add (+) > Module Dependency > Select kit`
3. In your AndroidManifest.xml, add the line `tools:replace="android:theme,android:icon"` in side the `Application` tag.
4. In your AndroidManifest.xml, set your Theme to `Kit`

##Contents
Kit includes a `colors.xml`, `styles.xml`, `themes.xml`, `dimens.xml` that should be ready for use on its own, although you might want to override some colors.

Kit uses [Fontain](https://github.com/scopely/fontain) for custom fonts. Follow the instructions on the Fontain page on how to set that up.

Kit contains Util classes to help with typical android stuff, pxToDp conversions, and animations.

Kit contains background drawables for buttons and rounded backgrounds.

TODO: Kit will contain common animations.

##Element Types
**General** means unimportant elements. So if the background was off-white, a General Type button would be light grey.

**Primary** means the most important elements. You should reserve theses for call-to-action types only.

**Background** means background elements/colors. So if its a dark theme, background would be a dark grey.


##Overriding
If you want to override any elements, just declare the style or color with the same name in your actual project, and it should automatically use that instead of the old value.
