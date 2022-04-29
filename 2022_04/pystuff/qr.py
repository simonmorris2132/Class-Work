import qrcode

img = qrcode.make("https://open.spotify.com/artist/72qOGv3zp1iEaOpQIHXF7g")

img.save("abriction.jpg")