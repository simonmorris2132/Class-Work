import qrcode

img = qrcode.make("https://stacyhassett.bandcamp.com")

img.save("myQr.jpg")