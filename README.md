**Profile Card App**

This project allows you to make a custom profile card using Jetpack Compose displaying your image, name, and biography.


**Installation**
1.  Clone the repository:
    > https://github.com/stephsq/ProfileCard.git
    
2.  Open in Android Studio:
    > Launch Android Studio.
    > Select Open and navigate to the project folder.
    
3.  Run the App:
    > Select an emulator or you may connect a physical device.
    > Click the green Run button on top right of your screen.

**Customize**
1. To change the profile information, modify the strings in "MainActivity.kt":
    ```kotlin
    ProfileCard(
        name = "Your Name Here",
        description = "Your short bio goes here."
        imageResource = R.drawable.[Your image name]
    )
    ```

2. To change the profile image,:
    > Click on Resourse manager on left panel and add using the '+' symbol.
    > Import Drawable and navigate to your image file.
    > Name your image item, Qualifier Type: Density, Value: No Density.
    > Click Next and Import.
    > Use the name you chose into "imageResource = R.drawable.[Your image name]".
