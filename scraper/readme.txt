===============================================
Step 1: Install googleimagesdownload and Pillow
  - pip install google_images_download
  - pip install Pillow

===============================================
Step 2: Download desired images
  - Edit config.json if needed 
    - Googleimagesdownload Docs:
      - https://github.com/hardikvasa/google-images-download
      - https://google-images-download.readthedocs.io/en/latest/examples.html#
  - run 'googleimagesdownload -cf config.json'

===============================================
Step 3: Resize downloaded images
  - Run 'python resize.py'
