from tkinter import *
from tkinter.tix import COLUMN
import settings
import utils
from cell import Cell

root = Tk()
root.configure(bg='black')
root.geometry(f'{settings.WIDTH}x{settings.HEIGHT}')
root.title("Minesweeper")
root.resizable(False, False)


top_frame = Frame(
    root,
    background='black',
    width=settings.WIDTH,
    height=utils.height_prct(25)
)

top_frame.place(x=0, y=0)

left_frame = Frame(
    root,
    background='black',
    width=utils.width_prct(25),
    height=utils.height_prct(75)
)

left_frame.place(x=0, y=utils.height_prct(25))

center_frame = Frame(
    root,
    background='black',
    width=utils.width_prct(75),
    height=utils.height_prct(75)
)

center_frame.place(x=utils.width_prct(25), y=utils.height_prct(25))

for x in range(settings.GRID_SIZE):
    for y in range(settings.GRID_SIZE):
        c = Cell()
        c.create_btn_object(center_frame)
        c.cell_btn_object.grid(
            column=x, row=y
        )

root.mainloop()