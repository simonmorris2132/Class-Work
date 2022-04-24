from tkinter import *

root = Tk()
root.geometry('1280x600')
root.title("Minesweeper")
root.resizable(False, False)


top_frame = Frame(
    root,
    background='red',
    width=1280,
    height=180
)

top_frame.place(x=0, y=0)

left_frame = Frame(
    root,
    background='blue',
    width=360,
    height=540
)

left_frame.place(x=0, y=180)

root.mainloop()