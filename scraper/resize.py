from PIL import Image
import os, sys

#Resize images
directory = r"C:\Users\Nathan\Desktop\COGS 300\TrashClass\scraper\downloads"
subDirs = [x[0] for x in os.walk(directory)]
for path in subDirs:
    print(path)
    dirs = os.listdir( path )

    def resize():
        count = 0
        for item in dirs:
            if os.path.isfile(path+"\\"+item):
                count+=1
                im = Image.open(path+"\\"+item)
                f, e = os.path.splitext(path+"\\"+item)
                imResize = im.resize((512,384), Image.ANTIALIAS)
                os.remove(path+"\\"+item)
                imResize.save(path + "\\" + os.path.basename(path) + str(count) + '.jpg', 'JPEG', quality=90)
        return count

    print("Resized " + str(resize()) + " images.")
print("Done!")
