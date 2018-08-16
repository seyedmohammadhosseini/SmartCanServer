/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "Platoon"
 */
package com.iot.nero.smartcan.entity.platoon;

import java.io.*;
import javax.validation.constraints.*;
import org.asnlab.asndt.runtime.conv.*;
import org.asnlab.asndt.runtime.conv.annotation.*;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.*;

public class Position3D {

	@NotNull
	@Component(0)
	public Double longitude;

	@NotNull
	@Component(1)
	public Double latitude;

	@NotNull
	@Component(2)
	public Double velocity;

	@NotNull
	@Component(3)
	public Double yaw;

	@NotNull
	@Component(4)
	public Double altitude;

	@NotNull
	@Component(5)
	public byte[] gpsUtime;


	public Object clone() {
		return TYPE.clone(this, CONV);
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Position3D)){
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

	public static Position3D ber_decode(InputStream in) throws IOException {
		return (Position3D)TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
	}

	public void cer_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.CANONICAL_ENCODING_RULES, CONV, out);
	}

	public static Position3D cer_decode(InputStream in) throws IOException {
		return (Position3D)TYPE.decode(in, EncodingRules.CANONICAL_ENCODING_RULES, CONV);
	}

	public void der_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV, out);
	}

	public static Position3D der_decode(InputStream in) throws IOException {
		return (Position3D)TYPE.decode(in, EncodingRules.DISTINGUISHED_ENCODING_RULES, CONV);
	}

	public void per_encode(boolean align, OutputStream out) throws IOException {
		TYPE.encode(this, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
	}

	public static Position3D per_decode(boolean align, InputStream in) throws IOException {
		return (Position3D)TYPE.decode(in, align? EncodingRules.ALIGNED_PACKED_ENCODING_RULES:EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
	}


	public final static AsnType TYPE = Platoon.type(65540);

	public final static CompositeConverter CONV;

	static {
		CONV = new AnnotationCompositeConverter(Position3D.class);
		AsnConverter longitudeConverter = DoubleConverter.INSTANCE;
		AsnConverter latitudeConverter = DoubleConverter.INSTANCE;
		AsnConverter velocityConverter = DoubleConverter.INSTANCE;
		AsnConverter yawConverter = DoubleConverter.INSTANCE;
		AsnConverter altitudeConverter = DoubleConverter.INSTANCE;
		AsnConverter gpsUtimeConverter = TimeStamp.CONV;
		CONV.setComponentConverters(new AsnConverter[] { longitudeConverter, latitudeConverter, velocityConverter, yawConverter, altitudeConverter, gpsUtimeConverter });
	}


}