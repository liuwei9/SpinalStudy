// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Wire_decl
// Git hash  : 9b190b44ada47dc8b4c11aaa0d02295b44fc8c8e

`timescale 1ns/1ps 

module Wire_decl (
  input               a,
  input               b,
  input               c,
  input               d,
  output              o,
  output              o_n
);

  wire                temp;

  assign temp = ((a && b) || (c && d));
  assign o = temp;
  assign o_n = (! temp);

endmodule
