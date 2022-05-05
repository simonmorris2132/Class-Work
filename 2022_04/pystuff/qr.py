import qrcode

img = qrcode.make("https://stacyhassett.bandcamp.com")

img.save("eelbath.jpg")