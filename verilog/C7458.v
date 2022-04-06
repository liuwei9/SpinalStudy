// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : C7458
// Git hash  : 9b190b44ada47dc8b4c11aaa0d02295b44fc8c8e

`timescale 1ns/1ps 

module C7458 (
  input               p1a,
  input               p1b,
  input               p1c,
  input               p1d,
  input               p1e,
  input               p1f,
  output              p1y,
  input               p2a,
  input               p2b,
  input               p2c,
  input               p2d,
  output              p2y
);


  assign p1y = (((p1a && p1b) && p1c) || ((p1d && p1e) && p1f));
  assign p2y = ((p2a && p2b) || (p2c && p2d));

endmodule
