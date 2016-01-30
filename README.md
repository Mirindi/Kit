# Kit
###A UI and Util Base module to be used in all future projects

##Why did I make this?
Like anyone other android developer, I found my self copy and pasting commonly used classes and xml files back and forth whenever I started new projects. So I said to myself that I might as well make an organized library of UI elements, boilerplate xml, and util classes that I can use on any future projects.

##Installation
1. Clone or copy the `kit` folder into the root folder of your project, inline with your `app` folder.
2. In Android Studio, go to `Project Structure > App Name > Dependencies > Add (+) > Module Dependency > Select kit`
3. In your AndroidManifest.xml, add the line `tools:replace="android:theme,android:icon"` in side the `Application` tag.
