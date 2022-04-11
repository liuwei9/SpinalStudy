// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Vector1
// Git hash  : 1a6ef9c12845a262d6ad38eaf795d8ec30ce56b4

`timescale 1ns/1ps 

module Vector1 (
  input      [15:0]   i,
  output     [7:0]    out_hi,
  output     [7:0]    out_lo
);

  wire       [7:0]    _zz_out_hi;

  assign _zz_out_hi = i[15 : 8];
  assign out_hi = {_zz_out_hi[0],{_zz_out_hi[1],{_zz_out_hi[2],{_zz_out_hi[3],{_zz_out_hi[4],{_zz_out_hi[5],{_zz_out_hi[6],_zz_out_hi[7]}}}}}}};
  assign out_lo = i[7 : 0];

endmodule
