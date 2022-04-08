// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Vector4
// Git hash  : 3e984cf0c5a47a47430bf3efa90414156cccc740

`timescale 1ns/1ps 

module Vector4 (
  input      [7:0]    i,
  output     [31:0]   o
);


  assign o = {{24{i[7]}}, i};

endmodule
