/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "Platoon"
 */
package com.iot.nero.smartcan.entity.platoon;

import java.io.*;
import java.math.*;
import javax.validation.constraints.*;
import org.asnlab.asndt.runtime.conv.*;
import org.asnlab.asndt.runtime.conv.annotation.*;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.*;

public class Running {

	@NotNull
	@Component(0)
	public BreakPadelSwtichSts breakpadelswtich;

	@NotNull
	@Component(1)
	public Double breakCircuitPressure;

	@NotNull
	@Component(2)
	public Double battsoc;

	@NotNull
	@Component(3)
	public Double vcu616driverange;

	@NotNull
	@Component(4)
	public Double oilleft;

	@NotNull
	@Component(5)
	public Double longitudinalacceleration;

	@NotNull
	@Component(6)
	public Double lateralacceleration;

	@NotNull
	@Component(7)
	public Double higheracceleration;

	@NotNull
	@Component(8)
	public Double yawvelocity;

	@NotNull
	@Component(9)
	public Double steeringwheelrotationspeed;

	@NotNull
	@Component(10)
	public Double steeringwheelangle;

	@NotNull
	@Component(11)
	public Double sassteerwheelrotspd;

	@NotNull
	@Component(12)
	public Double steerwheelcurpos;

	@NotNull
	@Component(13)
	public Double acceleratorpos;

	@NotNull
	@Component(14)
	public Double throttlePercentage;

	@NotNull
	@Min(0L) @Max(16777215L)
	@Component(15)
	public Integer totaloso;

	@NotNull
	@Component(16)
	public VALIDWHEELSPEEDFL validwheelspeed;

	@NotNull
	@Component(17)
	public Double wheelspeedfl;

	@NotNull
	@Component(18)
	public VALIDWHEELSPEEDFR validwheelfr;

	@NotNull
	@Component(19)
	public Double wheelspeedfr;

	@NotNull
	@Component(20)
	public VALIDWHEELSPEEDRL validwheelspeedrl;

	@NotNull
	@Component(21)
	public Double wheelspeedrl;

	@NotNull
	@Component(22)
	public VALIDWHEELSPEEDRR validwheelrr;

	@NotNull
	@Component(23)
	public Double wheelspeedrr;

	@NotNull
	@Component(24)
	public Double vehiclespeed;

	@NotNull
	@Component(25)
	public Double motospeed;

	@NotNull
	@Component(26)
	public Double motoTorque;

	@NotNull
	@Component(27)
	public Double accaebaebstate;

	@NotNull
	@Component(28)
	public Double rotation;

	@NotNull
	@Component(29)
	public Double pitchangle;

	@NotNull
	@Component(30)
	public Double rollangle;

	@NotNull
	@Component(31)
	public Double azimuthangle;


	public Object clone() {
		return TYPE.clone(this, CONV);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Running)){
			return false;
		}
		return TYPE.equals(this, obj, CONV);
	}

	public void print(PrintStream out) {
		TYPE.print(this, CONV, out);
	}

	public void ber_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
	}

	public static Running ber_decode(InputStream in) throws IOException {
		return (Running)TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
	}

	public void cer_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.CANONICAL_ENCODING_RULES, CONV, out);
	}

	public static Running cer_decode(InputStream in) throws IOException {
		return (Running)TYPE.decode(in, EncodingRules.CANONICAL_ENCODING_RULES, CONV);
	}

	public void der_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV, out);
	}

	public static Running der_decode(InputStream in) throws IOException {
		return (Running)TYPE.decode(in, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV);
	}

	public void per_encode(boolean align, OutputStream out) throws IOException {
		TYPE.encode(this, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
	}

	public static Running per_decode(boolean align, InputStream in) throws IOException {
		return (Running)TYPE.decode(in, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
	}


	public final static AsnType TYPE = Platoon.type(65569);

	public final static CompositeConverter CONV;

	static {
		CONV = new AnnotationCompositeConverter(Running.class);
		AsnConverter breakpadelswtichConverter = BreakPadelSwtichSts.CONV;
		AsnConverter breakCircuitPressureConverter = DoubleConverter.INSTANCE;
		AsnConverter battsocConverter = DoubleConverter.INSTANCE;
		AsnConverter vcu616driverangeConverter = DoubleConverter.INSTANCE;
		AsnConverter oilleftConverter = DoubleConverter.INSTANCE;
		AsnConverter longitudinalaccelerationConverter = DoubleConverter.INSTANCE;
		AsnConverter lateralaccelerationConverter = DoubleConverter.INSTANCE;
		AsnConverter higheraccelerationConverter = DoubleConverter.INSTANCE;
		AsnConverter yawvelocityConverter = DoubleConverter.INSTANCE;
		AsnConverter steeringwheelrotationspeedConverter = DoubleConverter.INSTANCE;
		AsnConverter steeringwheelangleConverter = DoubleConverter.INSTANCE;
		AsnConverter sassteerwheelrotspdConverter = DoubleConverter.INSTANCE;
		AsnConverter steerwheelcurposConverter = DoubleConverter.INSTANCE;
		AsnConverter acceleratorposConverter = DoubleConverter.INSTANCE;
		AsnConverter throttlePercentageConverter = DoubleConverter.INSTANCE;
		AsnConverter totalosoConverter = IntegerConverter.INSTANCE;
		AsnConverter validwheelspeedConverter = VALIDWHEELSPEEDFL.CONV;
		AsnConverter wheelspeedflConverter = DoubleConverter.INSTANCE;
		AsnConverter validwheelfrConverter = VALIDWHEELSPEEDFR.CONV;
		AsnConverter wheelspeedfrConverter = DoubleConverter.INSTANCE;
		AsnConverter validwheelspeedrlConverter = VALIDWHEELSPEEDRL.CONV;
		AsnConverter wheelspeedrlConverter = DoubleConverter.INSTANCE;
		AsnConverter validwheelrrConverter = VALIDWHEELSPEEDRR.CONV;
		AsnConverter wheelspeedrrConverter = DoubleConverter.INSTANCE;
		AsnConverter vehiclespeedConverter = DoubleConverter.INSTANCE;
		AsnConverter motospeedConverter = DoubleConverter.INSTANCE;
		AsnConverter motoTorqueConverter = DoubleConverter.INSTANCE;
		AsnConverter accaebaebstateConverter = DoubleConverter.INSTANCE;
		AsnConverter rotationConverter = DoubleConverter.INSTANCE;
		AsnConverter pitchangleConverter = DoubleConverter.INSTANCE;
		AsnConverter rollangleConverter = DoubleConverter.INSTANCE;
		AsnConverter azimuthangleConverter = DoubleConverter.INSTANCE;
		CONV.setComponentConverters(new AsnConverter[] { breakpadelswtichConverter, breakCircuitPressureConverter, battsocConverter, vcu616driverangeConverter, oilleftConverter, longitudinalaccelerationConverter, lateralaccelerationConverter, higheraccelerationConverter, yawvelocityConverter, steeringwheelrotationspeedConverter, steeringwheelangleConverter, sassteerwheelrotspdConverter, steerwheelcurposConverter, acceleratorposConverter, throttlePercentageConverter, totalosoConverter, validwheelspeedConverter, wheelspeedflConverter, validwheelfrConverter, wheelspeedfrConverter, validwheelspeedrlConverter, wheelspeedrlConverter, validwheelrrConverter, wheelspeedrrConverter, vehiclespeedConverter, motospeedConverter, motoTorqueConverter, accaebaebstateConverter, rotationConverter, pitchangleConverter, rollangleConverter, azimuthangleConverter });
	}


}
