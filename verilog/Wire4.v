// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Wire4
// Git hash  : 72c81709f6079e4a0e5a96e4041fbb2dbe9644dd

`timescale 1ns/1ps 

module Wire4 (
  input      [0:0]    a,
  input      [0:0]    b,
  input      [0:0]    c,
  output     [0:0]    w,
  output     [0:0]    x,
  output     [0:0]    y,
  output     [0:0]    z
);

  wire       [3:0]    _zz_w;

  assign _zz_w = {{{a,b},b},c};
  assign z = _zz_w[0 : 0];
  assign y = _zz_w[1 : 1];
  assign x = _zz_w[2 : 2];
  assign w = _zz_w[3 : 3];

endmodule
