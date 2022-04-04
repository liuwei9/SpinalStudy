// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Norgate
// Git hash  : 762e5bc8f65a53b6f5dd6821f7ea936c4e52833f

`timescale 1ns/1ps 

module Norgate (
  input               a,
  input               b,
  output              o
);


  assign o = (! (a || b));

endmodule
