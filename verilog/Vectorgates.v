// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Vectorgates
// Git hash  : 3e984cf0c5a47a47430bf3efa90414156cccc740

`timescale 1ns/1ps 

module Vectorgates (
  input      [2:0]    a,
  input      [2:0]    b,
  output     [2:0]    out_or_bitwise,
  output              out_or_logical,
  output     [5:0]    out_not
);


  assign out_or_bitwise = (a | b);
  assign out_or_logical = ((|a) || (|b));
  assign out_not = {(~ b),(~ a)};

endmodule
