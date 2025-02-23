# Buoyancy Control in Scuba Diving Game

### Changed ontrols

- UP / A: inflate Buoyancy Control Device (BCD) (hold or click)
- DOWN / S: deflate BCD (hold or click)
- RIGHT - unchanged, swim right
- LEFT - unchanged, swim left

### Intro

One of the most essential skills in scuba diving is buoyancy control. Mastering this skill early on offers numerous benefits, including:

- **Reduced Gas Consumption**: Enjoy longer dives by using less air.
- **Enhanced Safety**: Avoid unplanned, rapid depth changes.
- **Increased Enjoyment**: Spend more uninterrupted time admiring the underwater world.

As a beginner diver, grasping the concepts of Buoyancy Control Devices (BCD) can be challenging. Key principles include:

- **Deflate to Descend**
- **Inflate to Slow Down**
- **Inflate to Ascend**
- **Deflate to Slow Down**

These concepts can be overwhelming, especially when transitioning from theoretical knowledge gained from books or instructors to practical application during your first open water or pool sessions.

## Project Overview

The purpose of forking the ScubaDiver repository was to enhance the game by incorporating basic physics principles, allowing players to experience buoyancy at different depths.

### Underlying Science

The game is based on two fundamental principles: **Boyle's Law** and **Archimedes' Principle**. In short, ambient pressure affects the volume of air in the BCD, which in turn influences buoyancy.

**Note**: The simulation is significantly simplified. For instance, lung capacity is not considered. The focus is solely on how the air in the BCD expands and contracts, affecting buoyancy. Additionally, the game does not account for the fact that to ascend slightly, divers should use their fins instead of inflating the BCD, which can waste air.

### Assumptions

For the buoyancy calculations, the following assumptions were made:

- Diver weight: **80 kg**
- Ballast weight: **5 kg**
- BCD lift capacity: **0-15 kg**

### Gameplay Adjustments

To provide a more realistic experience, the game’s background speed has been slowed down, allowing players more time to ascend and descend. Players cannot simply use arrow keys to navigate instantly. However, the game still retains its fun elements, such as navigating around obstacles and collecting debris.

Feel free to explore and enjoy the game while learning about buoyancy control in scuba diving!






# Scuba Diving Game

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d113af0da84b4ab9b17b8ffc29c58ecf?branch=admin-javafx)](https://app.codacy.com/project/leonardomarcao/ScubaDiving/dashboard)

<p align="center"><a target="_blank" href="https://www.youtube.com/watch?v=x9mtLNFgO_s"><img src="https://i.imgur.com/AOlRFtY.png" alt="Scuba Diving - Game project on sustainable development"></a></p>

## About

Game project developed at the Paulista University on sustainable development. The Scuba Diving Game has a didactic purpose of helping other people understand a little about sustainability, with the main scenario being a scuba diver who collects garbage at the bottom of the ocean.

## How does it work?

Scuba Diving Game was developed through a 2D Java Game Library, called Slick2D. Slick2d is an easy to use set of tools and utilites wrapped around LWJGL and OpenGL bindings to make 2D Java game development easier.

### Class Diagram
<p align="center"><img src="https://github.com/leonardomarcao/ScubaDiving/blob/master/classDiagram/ClassDiagramScubaDiving.png?raw=true"></p>

## Instalattion

Following the steps of Slick2D [wiki](http://slick.ninjacave.com/wiki/index.php?title=Main_Page)
#### Downloading and Extracting Slick2D and LWJGL
1. Download [Slick2D](http://slick.ninjacave.com/)
2. Download LWJGL **[2.9.3](https://sourceforge.net/projects/java-game-lib/files/Official%20Releases/LWJGL%202.9.3/)**
3. Extract the LWJGL zip (lwjgl-x.x.zip) file somewhere in your computer, remember or note down the location, you will need this later. We suggest you create a library (/lib) folder to store all these files in a well-known place.

#### Setting Up Slick2D and LWJGL in NetBeans
Extracted from LWJGL with Netbeans
1. Open up NetBeans.
2. Go to Tools --> Libraries in the menu bar.
3. Click on the New Library button.
4. Type in Slick2D or any other name that you want for the Library Name.
5. Select Classpath tab for your newly created Library and then click the Add JAR/Folder... button.
6. Go to where you extracted lwjgl-X.X.zip and add the following '.jar'('Ctrl' or 'Alt' to select multiple files)
   1. lwjgl.jar
   2. slick.jar
   3. jinput.jar
   4. lwjgl_util.jar (if want to use OpenGL's GLU class)

#### Setting Up a Project to use LWJGL in NetBeans
In a new Java project:
1. Right-Click your project node or go to File>Project Properties and select Libraries
2. Add your Slick2D Library , created as instructed above
3. Select Run
4. On VM Options put the following:
   `-Djava.library.path=<lwjgl-X.X path>/native/<linux|macosx|solaris|windows>`
   
Note: Remember to select the natives of your operating system.

After all the steps above, the Scuba Diving Game project can now be compiled.

## License 

MIT License

Copyright (c) 2018 Leonardo Marc„o

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
