from pathlib import Path
from PIL import Image
import os, sys

#Resize images
directory = Path("downloads/")
directory = str(directory.resolve())
print(directory)
subDirs = [x[0] for x in os.walk(directory)]
for path in subDirs:
    print(path)
    dirs = os.listdir( path )

    def resize():
        count = 0
        for item in dirs:
            itemPath = os.path.join(path, item)
            if os.path.isfile(itemPath):
                count+=1
                try:
                    im = Image.open(itemPath)
                    f, e = os.path.splitext(itemPath)
                    imResize = im.resize((400,400), Image.ANTIALIAS)
                    #print(itemPath)
                    os.remove(itemPath)
                    imResize.save(os.path.join(path, os.path.basename(path) + str(count) + '.jpg'), 'JPEG', quality=90)
                except:
                    print("An exception occurred!")
        return count

    print("Resized " + str(resize()) + " images.")
print("Done!")
