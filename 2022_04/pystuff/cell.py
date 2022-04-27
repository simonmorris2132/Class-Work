from tkinter import *

class Cell:
    def __init__(self, is_mine=False):
        self.is_mine = is_mine
        self.cell_btn_object = None
        self.x = x
        self.y = y
        
    def create_btn_object(self, location):
        btn = Button(
            location,
            width=12, 
            height=4,
            text=f"{self.x},{self.y}"
        )
        
        self.cell_btn_object = btn
        btn.bind('<Button-1>', self.left_click_actions) #left click
        btn.bind('<Button-3>', self.right_click_actions) #right click
        
    def left_click_actions(self, event):
        print(event)
        print("I am left-clicked!")
        
    def right_click_actions(self, event):
        print(event)
        print("I am right-clicked!")
