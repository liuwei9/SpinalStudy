// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Vector0
// Git hash  : 3e984cf0c5a47a47430bf3efa90414156cccc740

`timescale 1ns/1ps 

module Vector0 (
  input      [2:0]    vec,
  output     [2:0]    outv,
  output              o0,
  output              o1,
  output              o2
);


  assign outv = vec;
  assign o0 = vec[0];
  assign o1 = vec[1];
  assign o2 = vec[2];

endmodule
