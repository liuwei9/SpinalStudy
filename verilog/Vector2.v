// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Vector2
// Git hash  : 58ae52bc1b7d0df3970cdd3e11d023b8e1742b8b

`timescale 1ns/1ps 

module Vector2 (
  input      [31:0]   i,
  output     [31:0]   o
);


  assign o = {{{i[7 : 0],i[15 : 8]},i[23 : 16]},i[31 : 24]};

endmodule
