// Generator : SpinalHDL v1.6.2    git head : 6f25d9a541c42028018402843d80c1b0948f0d13
// Component : Notgate
// Git hash  : 762e5bc8f65a53b6f5dd6821f7ea936c4e52833f

`timescale 1ns/1ps 

module Notgate (
  input               i,
  output              o
);


  assign o = (! i);

endmodule
