![issues](https://img.shields.io/github/issues/mbpatel6245/csp)
![Forks](https://img.shields.io/github/forks/mbpatel6245/csp)
![Stars](https://img.shields.io/github/stars/mbpatel6245/csp)
[![Jitpack](https://jitpack.io/v/mbpatel6245/csp.svg)](https://jitpack.io/#mbpatel6245/csp)
![License](https://img.shields.io/github/license/mbpatel6245/csp)

# csp - A Composable Scalable Size Unit for Texts
An android lib that provides a new size unit - csp (compose sp). This size unit scales with the screen size for Jetpack Compose Structure. It can help Android developers with supporting multiple screens for Compose structure.

This is the sibling of the [cdp](https://github.com/mbpatel6245/cdp) size unit that should be used for non text views.

# Attention
Use it carefully! for example, in most cases you still need to design a different layout for tablets.

# Example
Here is a single layout built using **csp**:

![csp example](https://github.com/mbpatel6245/csp/blob/master/csp_example.png)

And Here is the same layout built using **sp**:

![sp example](https://github.com/mbpatel6245/csp/blob/master/sp_example.png)

You can see that csp scales with the screen size and the sp stays with the same size on all screen sizes.

# Getting Started
To add csp to your project (Using Android Studio and Gradle):

**Step 1.** Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency
```
dependencies {
    implementation 'com.github.mbpatel6245:csp:ReleaseVersion'
}
```

**Step 3.** Provide type to your composable theme
```
ProvideFontDimens(dimensions = getFontDimensType()) {
    MaterialTheme(
        ...
    )
}
```
**Step 4.** Use on Widget
```
Spacer(modifier = Modifier.height(CSP.dimens._15csp))
```

# Note
The csp size unit calculation includes some approximation due to some performance and usability constraints.