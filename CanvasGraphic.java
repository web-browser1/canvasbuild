package *.product.com.canvaslibrary;

import android.util.AttributeSet;


	/** CanvasGraphic
	 *
	 * Author: David A. 2016, Copyright 2022
	 *
	 * */


public class CanvasGraphic {

	private Canvas mCanvas;
	private Paint mPaint;
	private Context mContext;
	
	
	private float tile = 0;
	private float tw = 0;
	private float tt = 0;
	
	private float dimensional0[][][][];
	
	private int load = 0;
	
	private CanvasEngine cengine;
	
	
	
	
	
	public CanvasGraphic(Context context, int i) {
		// TODO Auto-generated constructor stub
		this.mContext = context;
		this.load = i;
		initialize();
	}
	
	public CanvasGraphic(Context context) {
		// TODO Auto-generated constructor stub
		this.mContext = context;
		initialize();
	}
	
	public CanvasGraphic(Context context, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		this.mContext = context;
		initialize();
	}
	
	public CanvasGraphic(Context context, AttributeSet attrs, int defStyle) {
		// TODO Auto-generated constructor stub
		this.mContext = context;
		initialize();
	}
	
	
	/*
	
	public CanvasGraphic(Context context, float tile, float tw, float tt) {
		// TODO Auto-generated constructor stub
		super(context);
		this.mContext = context;
		this.tile = tile;
		this.tw = tw;
		this.tt = tt;
		initialize();
		
	}
	
	*/

	private int REPLACE_CANVAS = 1;
	
	private float xy3d[][];
	private String pcolor[][];
	
	private int xyp[][];
	private float xy3da[][][];
	private String ecolor = "#FFFFFF";
	
	
	public void initialize() {
		
		if( REPLACE_CANVAS == 1 ) {
			this.tile = 800 / 25; // 20
			
			this.tt = 360 / tile;
			this.tw = 800 / tile;
		}
		
		
		cengine = new CanvasEngine(mContext, tile, tt, tw);
		float dimensional5[][][][];
		
		int layout = 0;
		Canvas canvas = new Canvas();
		int s_gon = 0;
		
		/**
		 * 
		 * Square shape 
		 * 
		 */
	
		float type = 0;
		float shapes = 0;
		
		float border = 0;
		float split = 0;
		
		float col = 0; 
		float rows = 0;
		
		float pos = 0;
		float x = 0; 
		float y = 0;
		
		float rx = 0; 
		float ry = 0;
		
		
		/** ## DATA STRUCTURE 
		 
		[s_gon][0][0][0]; // width
		[s_gon][0][1][0]; // height
		[s_gon][0][2][0]; // shapes
		[s_gon][0][2][1]; // border
		
		[s_gon][0][3][0]; // col
		[s_gon][0][3][1]; // rows

		[s_gon][1][0][0]; // type
		[s_gon][1][1][0]; // color
		
		[s_gon][1][2][0]; // pos
		
		[s_gon][2][0][0]; // apoints
		
		*/
	
		
		
		/*
		 *  Skew 3D shape
		 * 
		 */
	  	
	  	
	  	float gx = 0, gy = 0, gw = 0, gdp = 0, gfh = 0, gd = 0;
	  	
	  	float gskew = 0;
	  	float mb = 0.3f;
	  	
	  	/* Library */
		
		float xylib[][] = new float[][] {
				{ gx+0.5f, gy+1, gw+0.6f, gdp-2.6f, gfh+6.2f, gskew+3 }, 
				
				{ gx+0.0f+mb, gy+2.4f, gw+7-(mb*2), gdp+-1.6f, gfh+1.4f, gskew+3 }, 
				
				{ gx+0f+mb, gy+9.6f-mb, gw+4.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+0f+mb, gy+9.6f-mb, gw+5.5f, gdp+0.5f, gfh+0.5f, gskew+3 }, 
				
				{ gx+0+mb, gy+6.0f-mb, gw+3-(mb*1), gdp+0, gfh+3.6f, gskew+3 }, 
				
				{ gx+2.6f+mb, gy+6.5f+mb, gw+2.4f, gdp+-2.8f, gfh+1f, gskew+3 }, 
				
				{ gx+0+mb, gy+3+mb, gw+7-(mb*2), gdp+0, gfh+2.0f, gskew+3 }, 
				
				{ gx+4+mb, gy+4f+mb, gw+0.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+2.2f, gy+9.6f-mb, gw+4.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+4f+mb, gy+9.6f-mb, gw+5.5f-(mb*2), gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+1f+mb, gy+6.5f+mb, gw+3, gdp+-2.8f, gfh+1f, gskew+3 },
				
				{ gx+4, gy+6.0f-mb, gw+3f-(mb*1), gdp+0, gfh+3.6f, gskew+3 },  
				
				{ gx+0+mb, gy+3+mb, gw+7-(mb*2), gdp+0, gfh+2.0f, gskew+3 }, 
				
				{ gx+1+mb, gy+4f+mb, gw+0.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
				// vector row 1 right
				
				{ gx+0f+mb, gy+9.6f-mb, gw+4.5f, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+0f+mb, gy+10.6f-mb, gw+5.5f, gdp+0f, gfh+0.5f, gskew+3 },  
				
				{ gx+0+mb, gy+5.6f-mb, gw+2.8f-(mb*1), gdp+-1, gfh+4f, gskew+3 }, 
				
				{ gx+2.4f+mb, gy+6.5f+mb, gw+2.4f, gdp+-2.8f, gfh+1f, gskew+3 }, 
			
				{ gx+0+mb, gy+3+mb, gw+7-(mb*2), gdp+-1, gfh+2.0f, gskew+3 }, 
				
				{ gx+4+mb, gy+4f+mb, gw+0.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
			
				// vector row 2 left
				
				{ gx+2.2f, gy+9.6f-mb, gw+4.5f, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+4f+mb, gy+9.6f-mb, gw+5.5f-(mb*2), gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+1f+mb, gy+6.5f+mb, gw+3, gdp+-2.8f, gfh+1f, gskew+3 },  
				
				{ gx+4.2f, gy+5.6f-mb, gw+2.8f-(mb*1), gdp+-1, gfh+4f, gskew+3 }, 
				
				{ gx+0+mb, gy+3+mb, gw+7-(mb*2), gdp+-1, gfh+2.0f, gskew+3 }, 
				
				{ gx+2+mb, gy+4f+mb, gw+0.5f, gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+1.8f+mb, gy+2.6f+mb, gw+6, gdp+0, gfh+0.5f, gskew+3 }, 
				
				{ gx+0f+mb, gy+3f+mb, gw+7-(mb*2), gdp+0, gfh+7-(mb*2), gskew+3 }, 
				
				{ gx+0f+mb, gy+3f+mb, gw+7, gdp+0, gfh+2f, gskew+3 }, 
				
				{ gx+0f+mb, gy+3f+mb, gw+7-(mb*2), gdp+0, gfh+7-(mb*2), gskew+3 }, // ground block 29
				
				{ gx+0f+mb, gy+3f+mb, gw+7-(mb*2), gdp+-2, gfh+7-(mb*2), gskew+3 }, // front block 30
				
				{ gx+0, gy+11, gw+2, gdp+0, gfh+1, gskew+3 }, 
				
				{ gx+0f+mb, gy+3f+mb, gw+7-(mb*2), gdp+0, gfh+7-(mb*2), gskew+3 }, // ground block stone 32
				
				{ gx+2.5f+mb, gy+5.6f+mb, gw+3, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+0.9f+mb, gy+5.6f+mb, gw+3, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+2.5f+mb, gy+5.6f+mb, gw+3, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+0.9f+mb, gy+5.6f+mb, gw+3, gdp+-1, gfh+0.5f, gskew+3 }, 
				
				{ gx+0.5f, gy+3, gw+5, gdp+-1.6f, gfh+1.8f, gskew+3 },
				
				{ gx+0.5f, gy+3, gw+5, gdp+-1.6f, gfh+2.2f, gskew+3 }, 

				{ gx+0f+mb, gy+9.6f-mb, gw+4.5f, gdp+-1, gfh+0.5f, gskew+3 }, 

				
		};
		
		
		
		
		
		/* library pick order */
		
		xyp = new int[][] {
			
				{ 0, 1, 37, 38 }, 
				
				{ 2, 3, 4, 5, 35, 6, 7 }, 
				
				{ 8, 9, 10, 36, 11, 12, 13 },
				
				{ 14, 15, 16, 17, 33, 18, 19 }, // vector right 3 
				
				{ 20, 21, 22, 34, 23, 24, 25 }, // vector left 4 
				
				{ 27, 32 }, // ground block tiled 5
				
				{ 28 }, 
				
				{ 29 }, // ground block single 7
				
				{ 30 }, // front block single 8
				
				{ 39 }, // move 9
				
				
		};
		
		
		int a = 0;
		
		int xyL = xylib.length;
		
		xy3da = new float[xyL][7][2];
		
		
		/* 3D Model */
		
		for( int h = 0; h< xyp.length; h++ ) {
			
			// xyar[p][4] = (10 - xyar[p][3]) - xyar[p][4];
			
			int ph = xyp[h].length;
			
			for( int b = 0; b<ph; b++ ) {
				
				int p = xyp[h][b];
				float b5 = xylib[p][5];
				float b2 = xylib[p][2];
				
				xylib[p][5] = xylib[p][5] + xylib[p][3];
				xylib[p][1] = xylib[p][1] - xylib[p][5];
				
				float spart = xylib[p][5] * 0.10f;
				
			//	xylib[p][5] = spart * xylib[p][2];
			//	xylib[p][2] = xylib[p][2] + xylib[p][5];
			//	xylib[p][2] = (xylib[p][2] + xylib[p][5]) > 10 ?  (xylib[p][2] - xylib[p][5]) :  xylib[p][2];
				
				
				// { gx+0f+mb, gy+0f+mb, gw+10-(mb*2), gdp+0, gfh+7f, gskew+3 }, // ground block 27
				
				xy3da[p][0][0] = xylib[p][0] + xylib[p][5]; 
				xy3da[p][0][1] = xylib[p][1] + 0;
				
				xy3da[p][1][0] = xylib[p][0] + 0; 
				xy3da[p][1][1] = xylib[p][1] + xylib[p][5];
				
				xy3da[p][2][0] = xylib[p][0] + xylib[p][2]; 
				xy3da[p][2][1] = xylib[p][1] + xylib[p][5];
				
				xy3da[p][3][0] = xylib[p][0] + xylib[p][2] + xylib[p][5]; 
				xy3da[p][3][1] = xylib[p][1] + 0;
				
				xy3da[p][4][0] = xylib[p][0] + 0; 
				xy3da[p][4][1] = xylib[p][1] + xylib[p][5] + xylib[p][4];
	
				xy3da[p][5][0] = xylib[p][0] + xylib[p][2]; 
				xy3da[p][5][1] = xylib[p][1] + xylib[p][5] + xylib[p][4];
	
				xy3da[p][6][0] = xylib[p][0] + xylib[p][2] + xylib[p][5];  
				xy3da[p][6][1] = xylib[p][1] + xylib[p][4];
				
				xylib[p][5] = b5;
				xylib[p][2] = b2;
				
			}
			
			
		}
		
		
		


		// #3F5661 
		
		// #2D3538
		
		String dshade = "#CC8C3B";



		pcolor = new String[][] {
				
				{ "#8f958f", "#838A84", "#9aa29b" }, 
				
				{ "#656887", "#5b5d79", "#717493" }, 
			
				{ "#657f75", "#5a726d", "#708c84", }, 
				
				{ "#5a5e5a", "#4D524E", "#656b65" }, 
				
				{ "#3C403D", "#303330", "#484C48" }, 
				
				{ "#698A6C" , "#557058", "#425744" }, 
			
				{ "#444F49", "#444F49", "#444F49" }, 
				
				{ "#5e7c62",  "#557058", "#688a6e" }, 

				 { "#eadcc5", "#A3B5B5", "#A3B5B5" }, 

				 { "#eadcc5", "#D3E6ED", "#9DD6ED" },  

				 { "#D3E6ED", "#D3E6ED", "#9DD6ED" },  

				//  orange  ,  blue ,  dark blue

				 { "#e8c292", "#8dbace", "#7DAABD" },  

				 { "#e8c292", "#879E9E", "#879E9E" }, 

				 { dshade, "#3A4040" , "#0E232E" },  

				 { dshade, "#2D3538", "#2D3538" }, 
				
			    { "#2E3631", "#2E3631", "#2E3631" }, 
				
				{ "#4e6451",  "#425744", "#59715c" }, 
				
				
				{ "#181C1A", "#181C1A", "#181C1A" }, 
					
				{ "#3B4F3E",  "#2E3D30", "#425744"},  
					
				{ "#536560", "#475955", "#5d736d", }, 
				
				{ "#3D4C48", "#33403D", "#475954", },
				
				{ "#53556b", "#47495E", "#5f6177" }, 
				
				{ "#404152", "#343545", "#4c4d5e" }, 
				
				{ "#FFFFFF", "#EEEEEE", "#2E3D30" }, 
				{ "#FFFFFF",  "#FFFFFF", "#FFFFFF" }, 
				{ "#D3E6ED",  "#CC8C3B", "#CC8C3B" }, 

				{ "#777D78", "#414541", "#242624" }, 

				{ "#FFFFFF", "#EEEEEE", "#2E3D30" }, 
			    
		};
		
		
		
		
		// Incomplete model
		
		float link[][] = new float[30][2];
		
		float start_p = 2f;
		float width_p = 4f;
	
		for( int c = 0; c<link.length; c++ ) {
			
			if( c == 0 ) {
			}
			if( c == 0 ) {
			}
			link[c][0] = 0;
			link[c][1] = 0;
		}
		float trees[][] = new float[][] {
			
			{   },
			
			{   },
			
			{   },
		};
		
		/*
		 * 
		 * 
		 *   04     3
		 * 
		 * 
		 *   1      2
		 *   
		 *   
		 *   06     5      4      
		 *   
		 *     1.0     1.1
		 *   
		 *   1      2      3
		 *   
		 */
		
		//  { { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },    { rx+10, ry+0 },{ rx+0,  ry+0 } },
		
		
		
		
		
		
		
		
		float  sx = 0, sy = 0, sw = 8, th = 2;
		
		float fh = 10 - th;
		float d = 1f;
	  	float skew = 2f;
		
	  	xy3d = new float[][] {
				{0+skew, 0},
	  			
	  			{0, th},
	  			{sw, th},
	  			
	  			{sw+skew, 0},
	  			
	  			{0, th+fh},
	  			{sw, th+fh},
	  			
	  			{sw+skew, fh}
		};
	  	
		/*
		
		float xy3d[][] = new float[][] {
				
				{0+skew-d, 0},
	  			
	  			{0, th-d},
	  			{sw, th-d},
	  			
	  			{sw+skew-d, 0},
	  			
	  			{0, th-d+fh},
	  			{sw, th-d+fh},
	  			
	  			{sw+skew-d, fh}
	  			
		};
		*/
		
		
		
		
		float   swc = 8, thc = 6, fhc = 3;
		
		float d2 = 1f;
		
		float xy3dc[][] = new float[][] {
				
				{0+skew-d2, 0},
	  			
	  			{0, thc-d2},
	  			{swc, thc-d2},
	  			
	  			{swc+skew-d2, 0},
	  			
	  			{0, thc-d2+fhc},
	  			{swc, thc-d2+fhc},
	  			
	  			{swc+skew-d2, fhc}
	  			
		};
		
		
		
		float pw = skew;
		
		//## DATA STRUCTURE EXAMPLE
		
		float dimensional_metric[][][][] = new float[][][][] {
				
				//TODO
				/*
				
				{ //s_gon 16 light spread blue
					
					{ { 22*tile },{ 14*tile }, { shapes+1, border+0 } },
					{ { type+6 }, { Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9"),Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9") } },
					{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
				},
				
				{ //s_gon 17 light spread grey
					
					{ { 22*tile },{ 14*tile }, { shapes+1, border+0 } },
					{ { type+6 }, { Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9"),Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9"), Color.parseColor("#FAFBE9") } },
					{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
				},
				
				{ //s_gon 19 fog blue
					
					{ { 10*tile },{ 10*tile }, { shapes+1, border+0 } },
					{ { type+6 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF") } },
					{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
				},
				
				{ //s_gon 20 fog grey
					
					{ { 10*tile },{ 10*tile }, { shapes+1, border+0 } },
					{ { type+6 }, { Color.parseColor("#777777"), Color.parseColor("#777777"),Color.parseColor("#777777"), Color.parseColor("#777777"), Color.parseColor("#777777") } },
					{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
				},
				*/
				
		};
		
		
		
		
		
		dimensional5 = dimensional_metric;
		
		dimensional0 = dimensional5;
		
		
		mtx = 0; mty = 0;
		
		
		if( load == 0 ) {
			textureCreate(canvas, layout);
		}
		
		
		if( load == 1 ) {
			loadCreate(canvas, layout);
		}
		
	}
	
	
	
	
	
	public float[][][][] getDimensionalVector(int s_gon) {
		
		float  sx = 0, sy = 0, sw = 8, th = 2;

		float rx = 0; 
		float ry = 0;

		float type = 0;
		float shapes = 0;
		
		float vars = 0;
		
		float border = 0;
		
		float split = 0;
		
		float col = 0; 
		float rows = 0;
		
		float pos = 0;
		
		float dimensional_1[][][][] = null;
		
		
		
		/// ### MAIN DATA STRUCTURE ####
		/// ############################
		
		
		switch (s_gon) {
		
		case 1: 
			
		dimensional_1 = new float[][][][] {
			
		{ //s_gon 1  vector
			
			{ { 2*tile },{ 2*tile }, { shapes+96, border+0 }, { col+4, rows+2 } },
			
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] },{ xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][4][0], xy3da[xyp[3][0]][4][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] },{ xy3da[xyp[3][0]][6][0], xy3da[xyp[3][0]][6][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] },{ xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][4][0], xy3da[xyp[3][2]][4][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] },{ xy3da[xyp[3][2]][6][0], xy3da[xyp[3][2]][6][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] },{ xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][4][0], xy3da[xyp[3][3]][4][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] },{ xy3da[xyp[3][3]][6][0], xy3da[xyp[3][3]][6][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] },{ xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][4][0], xy3da[xyp[3][4]][4][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] },{ xy3da[xyp[3][4]][6][0], xy3da[xyp[3][4]][6][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] },{ xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][4][0], xy3da[xyp[3][5]][4][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] },{ xy3da[xyp[3][5]][6][0], xy3da[xyp[3][5]][6][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }  }, 
			
		
			
			{ { type+0 }, { Color.parseColor(eyecolor ) }, { pos+1 } },
			{ { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] },{ xy3da[xyp[3][6]][4][0], xy3da[xyp[3][6]][4][1] },{ xy3da[xyp[3][6]][5][0], xy3da[xyp[3][6]][5][1] }, { xy3da[xyp[3][6]][2][0], xy3da[xyp[3][6]][2][1] }, { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] }  }, 
			
			
			

			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] },{ xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][4][0], xy3da[xyp[3][0]][4][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] },{ xy3da[xyp[3][0]][6][0], xy3da[xyp[3][0]][6][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] },{ xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][4][0], xy3da[xyp[3][2]][4][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] },{ xy3da[xyp[3][2]][6][0], xy3da[xyp[3][2]][6][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] },{ xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][4][0], xy3da[xyp[3][3]][4][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] },{ xy3da[xyp[3][3]][6][0], xy3da[xyp[3][3]][6][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] },{ xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][4][0], xy3da[xyp[3][4]][4][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] },{ xy3da[xyp[3][4]][6][0], xy3da[xyp[3][4]][6][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] },{ xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][4][0], xy3da[xyp[3][5]][4][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] },{ xy3da[xyp[3][5]][6][0], xy3da[xyp[3][5]][6][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }  }, 
			
		
			
			{ { type+0 }, { Color.parseColor(eyecolor ) }, { pos+1 } },
			{ { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] },{ xy3da[xyp[3][6]][4][0], xy3da[xyp[3][6]][4][1] },{ xy3da[xyp[3][6]][5][0], xy3da[xyp[3][6]][5][1] }, { xy3da[xyp[3][6]][2][0], xy3da[xyp[3][6]][2][1] }, { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] }  }, 
			
			

			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] },{ xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][0][0], xy3da[xyp[3][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] },{ xy3da[xyp[3][0]][4][0], xy3da[xyp[3][0]][4][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }, { xy3da[xyp[3][0]][1][0], xy3da[xyp[3][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] },{ xy3da[xyp[3][0]][5][0], xy3da[xyp[3][0]][5][1] },{ xy3da[xyp[3][0]][6][0], xy3da[xyp[3][0]][6][1] }, { xy3da[xyp[3][0]][3][0], xy3da[xyp[3][0]][3][1] }, { xy3da[xyp[3][0]][2][0], xy3da[xyp[3][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] },{ xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][0][0], xy3da[xyp[3][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] },{ xy3da[xyp[3][2]][4][0], xy3da[xyp[3][2]][4][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }, { xy3da[xyp[3][2]][1][0], xy3da[xyp[3][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] },{ xy3da[xyp[3][2]][5][0], xy3da[xyp[3][2]][5][1] },{ xy3da[xyp[3][2]][6][0], xy3da[xyp[3][2]][6][1] }, { xy3da[xyp[3][2]][3][0], xy3da[xyp[3][2]][3][1] }, { xy3da[xyp[3][2]][2][0], xy3da[xyp[3][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] },{ xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][0][0], xy3da[xyp[3][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] },{ xy3da[xyp[3][3]][4][0], xy3da[xyp[3][3]][4][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }, { xy3da[xyp[3][3]][1][0], xy3da[xyp[3][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] },{ xy3da[xyp[3][3]][5][0], xy3da[xyp[3][3]][5][1] },{ xy3da[xyp[3][3]][6][0], xy3da[xyp[3][3]][6][1] }, { xy3da[xyp[3][3]][3][0], xy3da[xyp[3][3]][3][1] }, { xy3da[xyp[3][3]][2][0], xy3da[xyp[3][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] },{ xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][0][0], xy3da[xyp[3][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] },{ xy3da[xyp[3][4]][4][0], xy3da[xyp[3][4]][4][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }, { xy3da[xyp[3][4]][1][0], xy3da[xyp[3][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] },{ xy3da[xyp[3][4]][5][0], xy3da[xyp[3][4]][5][1] },{ xy3da[xyp[3][4]][6][0], xy3da[xyp[3][4]][6][1] }, { xy3da[xyp[3][4]][3][0], xy3da[xyp[3][4]][3][1] }, { xy3da[xyp[3][4]][2][0], xy3da[xyp[3][4]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] },{ xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][0][0], xy3da[xyp[3][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] },{ xy3da[xyp[3][5]][4][0], xy3da[xyp[3][5]][4][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }, { xy3da[xyp[3][5]][1][0], xy3da[xyp[3][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] },{ xy3da[xyp[3][5]][5][0], xy3da[xyp[3][5]][5][1] },{ xy3da[xyp[3][5]][6][0], xy3da[xyp[3][5]][6][1] }, { xy3da[xyp[3][5]][3][0], xy3da[xyp[3][5]][3][1] }, { xy3da[xyp[3][5]][2][0], xy3da[xyp[3][5]][2][1] }  }, 
			
		
			
			{ { type+0 }, { Color.parseColor(eyecolor ) }, { pos+2 } },
			{ { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] },{ xy3da[xyp[3][6]][4][0], xy3da[xyp[3][6]][4][1] },{ xy3da[xyp[3][6]][5][0], xy3da[xyp[3][6]][5][1] }, { xy3da[xyp[3][6]][2][0], xy3da[xyp[3][6]][2][1] }, { xy3da[xyp[3][6]][1][0], xy3da[xyp[3][6]][1][1] }  }, 
			
			
			
			
			
			
			

			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] },{ xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][4][0], xy3da[xyp[4][0]][4][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] },{ xy3da[xyp[4][0]][6][0], xy3da[xyp[4][0]][6][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] },{ xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][4][0], xy3da[xyp[4][2]][4][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] },{ xy3da[xyp[4][2]][6][0], xy3da[xyp[4][2]][6][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] },{ xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][4][0], xy3da[xyp[4][3]][4][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] },{ xy3da[xyp[4][3]][6][0], xy3da[xyp[4][3]][6][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }  }, 
			
			

			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] },{ xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][4][0], xy3da[xyp[4][4]][4][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] },{ xy3da[xyp[4][4]][6][0], xy3da[xyp[4][4]][6][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(pcolor[2][0]) } },
			{ { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] },{ xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][1]) } },
			{ { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][4][0], xy3da[xyp[4][5]][4][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[2][2]) } },
			{ { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] },{ xy3da[xyp[4][5]][6][0], xy3da[xyp[4][5]][6][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] },{ xy3da[xyp[4][6]][4][0], xy3da[xyp[4][6]][4][1] },{ xy3da[xyp[4][6]][5][0], xy3da[xyp[4][6]][5][1] }, { xy3da[xyp[4][6]][2][0], xy3da[xyp[4][6]][2][1] }, { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] }  }, 
			
			
			
			


			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] },{ xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][4][0], xy3da[xyp[4][0]][4][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] },{ xy3da[xyp[4][0]][6][0], xy3da[xyp[4][0]][6][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] },{ xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][4][0], xy3da[xyp[4][2]][4][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] },{ xy3da[xyp[4][2]][6][0], xy3da[xyp[4][2]][6][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] },{ xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][4][0], xy3da[xyp[4][3]][4][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] },{ xy3da[xyp[4][3]][6][0], xy3da[xyp[4][3]][6][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }  }, 
			
			

			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] },{ xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][4][0], xy3da[xyp[4][4]][4][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] },{ xy3da[xyp[4][4]][6][0], xy3da[xyp[4][4]][6][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(pcolor[19][0]) } },
			{ { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] },{ xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][1]) } },
			{ { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][4][0], xy3da[xyp[4][5]][4][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[19][2]) } },
			{ { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] },{ xy3da[xyp[4][5]][6][0], xy3da[xyp[4][5]][6][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] },{ xy3da[xyp[4][6]][4][0], xy3da[xyp[4][6]][4][1] },{ xy3da[xyp[4][6]][5][0], xy3da[xyp[4][6]][5][1] }, { xy3da[xyp[4][6]][2][0], xy3da[xyp[4][6]][2][1] }, { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] }  }, 
			
			
			


			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] },{ xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][0][0], xy3da[xyp[4][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] },{ xy3da[xyp[4][0]][4][0], xy3da[xyp[4][0]][4][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }, { xy3da[xyp[4][0]][1][0], xy3da[xyp[4][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] },{ xy3da[xyp[4][0]][5][0], xy3da[xyp[4][0]][5][1] },{ xy3da[xyp[4][0]][6][0], xy3da[xyp[4][0]][6][1] }, { xy3da[xyp[4][0]][3][0], xy3da[xyp[4][0]][3][1] }, { xy3da[xyp[4][0]][2][0], xy3da[xyp[4][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] },{ xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][0][0], xy3da[xyp[4][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] },{ xy3da[xyp[4][2]][4][0], xy3da[xyp[4][2]][4][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }, { xy3da[xyp[4][2]][1][0], xy3da[xyp[4][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] },{ xy3da[xyp[4][2]][5][0], xy3da[xyp[4][2]][5][1] },{ xy3da[xyp[4][2]][6][0], xy3da[xyp[4][2]][6][1] }, { xy3da[xyp[4][2]][3][0], xy3da[xyp[4][2]][3][1] }, { xy3da[xyp[4][2]][2][0], xy3da[xyp[4][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] },{ xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][0][0], xy3da[xyp[4][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] },{ xy3da[xyp[4][3]][4][0], xy3da[xyp[4][3]][4][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }, { xy3da[xyp[4][3]][1][0], xy3da[xyp[4][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] },{ xy3da[xyp[4][3]][5][0], xy3da[xyp[4][3]][5][1] },{ xy3da[xyp[4][3]][6][0], xy3da[xyp[4][3]][6][1] }, { xy3da[xyp[4][3]][3][0], xy3da[xyp[4][3]][3][1] }, { xy3da[xyp[4][3]][2][0], xy3da[xyp[4][3]][2][1] }  }, 
			
			

			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] },{ xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][0][0], xy3da[xyp[4][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] },{ xy3da[xyp[4][4]][4][0], xy3da[xyp[4][4]][4][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }, { xy3da[xyp[4][4]][1][0], xy3da[xyp[4][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] },{ xy3da[xyp[4][4]][5][0], xy3da[xyp[4][4]][5][1] },{ xy3da[xyp[4][4]][6][0], xy3da[xyp[4][4]][6][1] }, { xy3da[xyp[4][4]][3][0], xy3da[xyp[4][4]][3][1] }, { xy3da[xyp[4][4]][2][0], xy3da[xyp[4][4]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(pcolor[20][0]) } },
			{ { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] },{ xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][0][0], xy3da[xyp[4][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][1]) } },
			{ { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] },{ xy3da[xyp[4][5]][4][0], xy3da[xyp[4][5]][4][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }, { xy3da[xyp[4][5]][1][0], xy3da[xyp[4][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[20][2]) } },
			{ { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] },{ xy3da[xyp[4][5]][5][0], xy3da[xyp[4][5]][5][1] },{ xy3da[xyp[4][5]][6][0], xy3da[xyp[4][5]][6][1] }, { xy3da[xyp[4][5]][3][0], xy3da[xyp[4][5]][3][1] }, { xy3da[xyp[4][5]][2][0], xy3da[xyp[4][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] },{ xy3da[xyp[4][6]][4][0], xy3da[xyp[4][6]][4][1] },{ xy3da[xyp[4][6]][5][0], xy3da[xyp[4][6]][5][1] }, { xy3da[xyp[4][6]][2][0], xy3da[xyp[4][6]][2][1] }, { xy3da[xyp[4][6]][1][0], xy3da[xyp[4][6]][1][1] }  }, 
			
			
			
			
		}
		};
			
			
		break;


		case 9:


			dimensional_1 = new float[][][][] {

				{ //s_gon 9   ground movement

                        { { 2*tile },{ 2*tile }, { shapes+3, border+0 }, { col+3, rows+2 } },



						{ { type+0 }, { Color.parseColor(pcolor[27][0]) }, { pos+1 } },
						{ { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] },{ xy3da[xyp[9][0]][1][0], xy3da[xyp[9][0]][1][1] },{ xy3da[xyp[9][0]][2][0], xy3da[xyp[9][0]][2][1] }, { xy3da[xyp[9][0]][3][0], xy3da[xyp[9][0]][3][1] }, { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] }  },

						{ { type+0 }, { Color.parseColor(pcolor[27][0]) }, { pos+1 } },
						{ { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] },{ xy3da[xyp[9][0]][1][0], xy3da[xyp[9][0]][1][1] },{ xy3da[xyp[9][0]][2][0], xy3da[xyp[9][0]][2][1] }, { xy3da[xyp[9][0]][3][0], xy3da[xyp[9][0]][3][1] }, { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] }  },

						{ { type+0 }, { Color.parseColor(pcolor[27][0]) } },
						{ { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] },{ xy3da[xyp[9][0]][1][0], xy3da[xyp[9][0]][1][1] },{ xy3da[xyp[9][0]][2][0], xy3da[xyp[9][0]][2][1] }, { xy3da[xyp[9][0]][3][0], xy3da[xyp[9][0]][3][1] }, { xy3da[xyp[9][0]][0][0], xy3da[xyp[9][0]][0][1] }  },


				}
			};


			break;



			case 5:
			

			dimensional_1 = new float[][][][] {
			
		{ //s_gon 5  tiled
			
			{ { 2*tile },{ 2*tile }, { shapes+96, border+0 }, { col+3, rows+2 } },
			
		
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] },{ xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][4][0], xy3da[xyp[1][0]][4][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] },{ xy3da[xyp[1][0]][6][0], xy3da[xyp[1][0]][6][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] },{ xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][4][0], xy3da[xyp[1][2]][4][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] },{ xy3da[xyp[1][2]][6][0], xy3da[xyp[1][2]][6][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] },{ xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][4][0], xy3da[xyp[1][3]][4][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] },{ xy3da[xyp[1][3]][6][0], xy3da[xyp[1][3]][6][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] },{ xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][4][0], xy3da[xyp[1][4]][4][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] },{ xy3da[xyp[1][4]][6][0], xy3da[xyp[1][4]][6][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] },{ xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][4][0], xy3da[xyp[1][5]][4][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] },{ xy3da[xyp[1][5]][6][0], xy3da[xyp[1][5]][6][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] },{ xy3da[xyp[1][6]][4][0], xy3da[xyp[1][6]][4][1] },{ xy3da[xyp[1][6]][5][0], xy3da[xyp[1][6]][5][1] }, { xy3da[xyp[1][6]][2][0], xy3da[xyp[1][6]][2][1] }, { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] }  }, 
			

			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] },{ xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][4][0], xy3da[xyp[1][0]][4][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] },{ xy3da[xyp[1][0]][6][0], xy3da[xyp[1][0]][6][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] },{ xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][4][0], xy3da[xyp[1][2]][4][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] },{ xy3da[xyp[1][2]][6][0], xy3da[xyp[1][2]][6][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] },{ xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][4][0], xy3da[xyp[1][3]][4][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] },{ xy3da[xyp[1][3]][6][0], xy3da[xyp[1][3]][6][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] },{ xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][4][0], xy3da[xyp[1][4]][4][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] },{ xy3da[xyp[1][4]][6][0], xy3da[xyp[1][4]][6][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] },{ xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][4][0], xy3da[xyp[1][5]][4][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] },{ xy3da[xyp[1][5]][6][0], xy3da[xyp[1][5]][6][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] },{ xy3da[xyp[1][6]][4][0], xy3da[xyp[1][6]][4][1] },{ xy3da[xyp[1][6]][5][0], xy3da[xyp[1][6]][5][1] }, { xy3da[xyp[1][6]][2][0], xy3da[xyp[1][6]][2][1] }, { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] }  }, 
			

			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] },{ xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][0][0], xy3da[xyp[1][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] },{ xy3da[xyp[1][0]][4][0], xy3da[xyp[1][0]][4][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }, { xy3da[xyp[1][0]][1][0], xy3da[xyp[1][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] },{ xy3da[xyp[1][0]][5][0], xy3da[xyp[1][0]][5][1] },{ xy3da[xyp[1][0]][6][0], xy3da[xyp[1][0]][6][1] }, { xy3da[xyp[1][0]][3][0], xy3da[xyp[1][0]][3][1] }, { xy3da[xyp[1][0]][2][0], xy3da[xyp[1][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] },{ xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][0][0], xy3da[xyp[1][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] },{ xy3da[xyp[1][2]][4][0], xy3da[xyp[1][2]][4][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }, { xy3da[xyp[1][2]][1][0], xy3da[xyp[1][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] },{ xy3da[xyp[1][2]][5][0], xy3da[xyp[1][2]][5][1] },{ xy3da[xyp[1][2]][6][0], xy3da[xyp[1][2]][6][1] }, { xy3da[xyp[1][2]][3][0], xy3da[xyp[1][2]][3][1] }, { xy3da[xyp[1][2]][2][0], xy3da[xyp[1][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] },{ xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][0][0], xy3da[xyp[1][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] },{ xy3da[xyp[1][3]][4][0], xy3da[xyp[1][3]][4][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }, { xy3da[xyp[1][3]][1][0], xy3da[xyp[1][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] },{ xy3da[xyp[1][3]][5][0], xy3da[xyp[1][3]][5][1] },{ xy3da[xyp[1][3]][6][0], xy3da[xyp[1][3]][6][1] }, { xy3da[xyp[1][3]][3][0], xy3da[xyp[1][3]][3][1] }, { xy3da[xyp[1][3]][2][0], xy3da[xyp[1][3]][2][1] }  }, 
			

			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] },{ xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][0][0], xy3da[xyp[1][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] },{ xy3da[xyp[1][4]][4][0], xy3da[xyp[1][4]][4][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }, { xy3da[xyp[1][4]][1][0], xy3da[xyp[1][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] },{ xy3da[xyp[1][4]][5][0], xy3da[xyp[1][4]][5][1] },{ xy3da[xyp[1][4]][6][0], xy3da[xyp[1][4]][6][1] }, { xy3da[xyp[1][4]][3][0], xy3da[xyp[1][4]][3][1] }, { xy3da[xyp[1][4]][2][0], xy3da[xyp[1][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] },{ xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][0][0], xy3da[xyp[1][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] },{ xy3da[xyp[1][5]][4][0], xy3da[xyp[1][5]][4][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }, { xy3da[xyp[1][5]][1][0], xy3da[xyp[1][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] },{ xy3da[xyp[1][5]][5][0], xy3da[xyp[1][5]][5][1] },{ xy3da[xyp[1][5]][6][0], xy3da[xyp[1][5]][6][1] }, { xy3da[xyp[1][5]][3][0], xy3da[xyp[1][5]][3][1] }, { xy3da[xyp[1][5]][2][0], xy3da[xyp[1][5]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+2 } },
			{ { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] },{ xy3da[xyp[1][6]][4][0], xy3da[xyp[1][6]][4][1] },{ xy3da[xyp[1][6]][5][0], xy3da[xyp[1][6]][5][1] }, { xy3da[xyp[1][6]][2][0], xy3da[xyp[1][6]][2][1] }, { xy3da[xyp[1][6]][1][0], xy3da[xyp[1][6]][1][1] }  }, 
			

			
			
			
			
			

			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] },{ xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][4][0], xy3da[xyp[2][0]][4][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] },{ xy3da[xyp[2][0]][6][0], xy3da[xyp[2][0]][6][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] },{ xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][4][0], xy3da[xyp[2][2]][4][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] },{ xy3da[xyp[2][2]][6][0], xy3da[xyp[2][2]][6][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] },{ xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][4][0], xy3da[xyp[2][3]][4][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] },{ xy3da[xyp[2][3]][6][0], xy3da[xyp[2][3]][6][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] },{ xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][4][0], xy3da[xyp[2][4]][4][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] },{ xy3da[xyp[2][4]][6][0], xy3da[xyp[2][4]][6][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[1][0]) } },
			{ { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] },{ xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][1]) } },
			{ { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][4][0], xy3da[xyp[2][5]][4][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[1][2]) } },
			{ { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] },{ xy3da[xyp[2][5]][6][0], xy3da[xyp[2][5]][6][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] },{ xy3da[xyp[2][6]][4][0], xy3da[xyp[2][6]][4][1] },{ xy3da[xyp[2][6]][5][0], xy3da[xyp[2][6]][5][1] }, { xy3da[xyp[2][6]][2][0], xy3da[xyp[2][6]][2][1] }, { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] }  }, 
			
			
			
			


			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] },{ xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][4][0], xy3da[xyp[2][0]][4][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] },{ xy3da[xyp[2][0]][6][0], xy3da[xyp[2][0]][6][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] },{ xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][4][0], xy3da[xyp[2][2]][4][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] },{ xy3da[xyp[2][2]][6][0], xy3da[xyp[2][2]][6][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] },{ xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][4][0], xy3da[xyp[2][3]][4][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] },{ xy3da[xyp[2][3]][6][0], xy3da[xyp[2][3]][6][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] },{ xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][4][0], xy3da[xyp[2][4]][4][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] },{ xy3da[xyp[2][4]][6][0], xy3da[xyp[2][4]][6][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[21][0]) } },
			{ { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] },{ xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][1]) } },
			{ { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][4][0], xy3da[xyp[2][5]][4][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[21][2]) } },
			{ { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] },{ xy3da[xyp[2][5]][6][0], xy3da[xyp[2][5]][6][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] },{ xy3da[xyp[2][6]][4][0], xy3da[xyp[2][6]][4][1] },{ xy3da[xyp[2][6]][5][0], xy3da[xyp[2][6]][5][1] }, { xy3da[xyp[2][6]][2][0], xy3da[xyp[2][6]][2][1] }, { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] }  }, 
			
			
			
			


			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] },{ xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][0][0], xy3da[xyp[2][0]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] },{ xy3da[xyp[2][0]][4][0], xy3da[xyp[2][0]][4][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }, { xy3da[xyp[2][0]][1][0], xy3da[xyp[2][0]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] },{ xy3da[xyp[2][0]][5][0], xy3da[xyp[2][0]][5][1] },{ xy3da[xyp[2][0]][6][0], xy3da[xyp[2][0]][6][1] }, { xy3da[xyp[2][0]][3][0], xy3da[xyp[2][0]][3][1] }, { xy3da[xyp[2][0]][2][0], xy3da[xyp[2][0]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] },{ xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][0][0], xy3da[xyp[2][2]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] },{ xy3da[xyp[2][2]][4][0], xy3da[xyp[2][2]][4][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }, { xy3da[xyp[2][2]][1][0], xy3da[xyp[2][2]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] },{ xy3da[xyp[2][2]][5][0], xy3da[xyp[2][2]][5][1] },{ xy3da[xyp[2][2]][6][0], xy3da[xyp[2][2]][6][1] }, { xy3da[xyp[2][2]][3][0], xy3da[xyp[2][2]][3][1] }, { xy3da[xyp[2][2]][2][0], xy3da[xyp[2][2]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] },{ xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][0][0], xy3da[xyp[2][3]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] },{ xy3da[xyp[2][3]][4][0], xy3da[xyp[2][3]][4][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }, { xy3da[xyp[2][3]][1][0], xy3da[xyp[2][3]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] },{ xy3da[xyp[2][3]][5][0], xy3da[xyp[2][3]][5][1] },{ xy3da[xyp[2][3]][6][0], xy3da[xyp[2][3]][6][1] }, { xy3da[xyp[2][3]][3][0], xy3da[xyp[2][3]][3][1] }, { xy3da[xyp[2][3]][2][0], xy3da[xyp[2][3]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] },{ xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][0][0], xy3da[xyp[2][4]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] },{ xy3da[xyp[2][4]][4][0], xy3da[xyp[2][4]][4][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }, { xy3da[xyp[2][4]][1][0], xy3da[xyp[2][4]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] },{ xy3da[xyp[2][4]][5][0], xy3da[xyp[2][4]][5][1] },{ xy3da[xyp[2][4]][6][0], xy3da[xyp[2][4]][6][1] }, { xy3da[xyp[2][4]][3][0], xy3da[xyp[2][4]][3][1] }, { xy3da[xyp[2][4]][2][0], xy3da[xyp[2][4]][2][1] }  }, 
			
			
			{ { type+0 }, { Color.parseColor(pcolor[22][0]) } },
			{ { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] },{ xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][0][0], xy3da[xyp[2][5]][0][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][1]) } },
			{ { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] },{ xy3da[xyp[2][5]][4][0], xy3da[xyp[2][5]][4][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }, { xy3da[xyp[2][5]][1][0], xy3da[xyp[2][5]][1][1] }  }, 
			{ { type+0 }, { Color.parseColor(pcolor[22][2]) } },
			{ { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] },{ xy3da[xyp[2][5]][5][0], xy3da[xyp[2][5]][5][1] },{ xy3da[xyp[2][5]][6][0], xy3da[xyp[2][5]][6][1] }, { xy3da[xyp[2][5]][3][0], xy3da[xyp[2][5]][3][1] }, { xy3da[xyp[2][5]][2][0], xy3da[xyp[2][5]][2][1] }  }, 
			
			
			
			{ { type+0 }, { Color.parseColor(eyecolor) }, { pos+1 } },
			{ { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] },{ xy3da[xyp[2][6]][4][0], xy3da[xyp[2][6]][4][1] },{ xy3da[xyp[2][6]][5][0], xy3da[xyp[2][6]][5][1] }, { xy3da[xyp[2][6]][2][0], xy3da[xyp[2][6]][2][1] }, { xy3da[xyp[2][6]][1][0], xy3da[xyp[2][6]][1][1] }  }, 
			
			
			
			
			

		},
		};
			
			
			break;
			
			
		
		
		
		
		
			
			
			
		default:
			break;
		}
		
		
		
		return dimensional_1;
	}
	
	
	
	

	// TODO
	
	
	public float[][][][] getDimensional(int s_gon) {
		
		float  sx = 0, sy = 0, sw = 8, th = 2;

		float rx = 0; 
		float ry = 0;

		float type = 0;
		float shapes = 0;
		
		float vars = 0;

		float stroke = 0;
		
		float border = 0;
		
		float split = 0;
		
		float col = 0; 
		float rows = 0;
		
		float pos = 0;
		
		float dimensional_1[][][][] = null;
		
		
		/// ####  MAIN DATA STRUCTURE   ######
		/// ##################################
		
		switch (s_gon) {
		case 0:
			
			dimensional_1 = new float[][][][] {
			{ //s_gon 0  background
				
				{ { 10*tile },{ 14*tile }, { shapes+3 }, { col+1, rows+3 } },
				
				{ { type+5, vars+2 }, { Color.parseColor(pcolor[9][0]), Color.parseColor(pcolor[9][0]), Color.parseColor(pcolor[9][1]), Color.parseColor(pcolor[9][2])  }, { pos+1 } },
				{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
				
				{ { type+5, vars+2 }, { Color.parseColor(pcolor[11][0]), Color.parseColor(pcolor[11][0]), Color.parseColor(pcolor[11][1]), Color.parseColor(pcolor[11][2])  }, { pos+1 } },
				{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
				
				{ { type+5, vars+2 }, { Color.parseColor(pcolor[13][0]),  Color.parseColor(pcolor[13][0]), Color.parseColor(pcolor[13][1]), Color.parseColor(pcolor[13][2])  } },
				{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
				
			}
			};
			
			
		break;
			
		case 2: 
				
			dimensional_1 = new float[][][][] {
			

			{ //s_gon 2  
					{ { 1*tile },{ 1*tile }, { shapes+3, border+0 }, { col+3, rows+2 } },

					{ { type+0 }, { Color.parseColor("#c7822a") }, { pos+1 } },
					{ { 2, 0 }, { 0, 2 }, { 2, 4 }, { 4, 2 }, { 2, 0 } },

					{ { type+0 }, { Color.parseColor("#af7225") }, { pos+1 } },
					{ { 2, 0 }, { 0, 2 }, { 2, 4 }, { 4, 2 }, { 2, 0 } },

					{ { type+0 }, { Color.parseColor("#9b6521") }, { pos+1 } },
					{ { 2, 0 }, { 0, 2 }, { 2, 4 }, { 4, 2 }, { 2, 0 } },

				/*
				{ { type+0 }, { Color.parseColor(pcolor[5][1]) } },
				{ { xy3da[xyp[6][0]][1][0], xy3da[xyp[6][0]][1][1] },{ xy3da[xyp[6][0]][4][0], xy3da[xyp[6][0]][4][1] },{ xy3da[xyp[6][0]][5][0], xy3da[xyp[6][0]][5][1] }, { xy3da[xyp[6][0]][2][0], xy3da[xyp[6][0]][2][1] }, { xy3da[xyp[6][0]][1][0], xy3da[xyp[6][0]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[5][2]) }, { pos+0 } },
				{ { xy3da[xyp[6][0]][2][0], xy3da[xyp[6][0]][2][1] },{ xy3da[xyp[6][0]][5][0], xy3da[xyp[6][0]][5][1] },{ xy3da[xyp[6][0]][6][0], xy3da[xyp[6][0]][6][1] }, { xy3da[xyp[6][0]][3][0], xy3da[xyp[6][0]][3][1] }, { xy3da[xyp[6][0]][2][0], xy3da[xyp[6][0]][2][1] }  }, 
				
				*/
			},
			
			};
			
			break;
			
			
		case 3:
			dimensional_1 = new float[][][][] {
			{  //s_gon 3  b tiled
				
				{ { 2*tile },{ 2*tile }, { shapes+18 }, { col+3, rows+2 } },
				
				
				{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
				{ { xy3da[xyp[5][0]][0][0], xy3da[xyp[5][0]][0][1] },{ xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] },{ xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }, { xy3da[xyp[5][0]][3][0], xy3da[xyp[5][0]][3][1] }, { xy3da[xyp[5][0]][0][0], xy3da[xyp[5][0]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
				{ { xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] },{ xy3da[xyp[5][0]][4][0], xy3da[xyp[5][0]][4][1] },{ xy3da[xyp[5][0]][5][0], xy3da[xyp[5][0]][5][1] }, { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }, { xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
				{ { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] },{ xy3da[xyp[5][0]][5][0], xy3da[xyp[5][0]][5][1] },{ xy3da[xyp[5][0]][6][0], xy3da[xyp[5][0]][6][1] }, { xy3da[xyp[5][0]][3][0], xy3da[xyp[5][0]][3][1] }, { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[3][0]) } },
				{ { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] },{ xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[3][1]) } },
				{ { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][4][0], xy3da[xyp[5][1]][4][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[3][2]) }, { pos+1 } },
				{ { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] },{ xy3da[xyp[5][1]][6][0], xy3da[xyp[5][1]][6][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[4][0]) } },
				{ { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] },{ xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[4][1]) } },
				{ { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][4][0], xy3da[xyp[5][1]][4][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[4][2]) }, { pos+2 } },
				{ { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] },{ xy3da[xyp[5][1]][6][0], xy3da[xyp[5][1]][6][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }  }, 
				
				//TODO

				{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
				{ { xy3da[xyp[5][0]][0][0], xy3da[xyp[5][0]][0][1] },{ xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] },{ xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }, { xy3da[xyp[5][0]][3][0], xy3da[xyp[5][0]][3][1] }, { xy3da[xyp[5][0]][0][0], xy3da[xyp[5][0]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
				{ { xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] },{ xy3da[xyp[5][0]][4][0], xy3da[xyp[5][0]][4][1] },{ xy3da[xyp[5][0]][5][0], xy3da[xyp[5][0]][5][1] }, { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }, { xy3da[xyp[5][0]][1][0], xy3da[xyp[5][0]][1][1] }  }, 

				{ { type+0 }, { Color.parseColor(pcolor[0][2]) } },
				{ { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] },{ xy3da[xyp[5][0]][5][0], xy3da[xyp[5][0]][5][1] },{ xy3da[xyp[5][0]][6][0], xy3da[xyp[5][0]][6][1] }, { xy3da[xyp[5][0]][3][0], xy3da[xyp[5][0]][3][1] }, { xy3da[xyp[5][0]][2][0], xy3da[xyp[5][0]][2][1] }  },


				{ { type+2, vars, stroke+4 }, {  Color.parseColor(pcolor[26][0]) }, { pos+1 }  },
				{ { rx+2,  ry+6 },{ rx+2,  ry+8 }, { rx+5, ry+8 }, { rx+5, ry+6 }, { rx+2, ry+6 } },


				{ { type+0 }, { Color.parseColor(pcolor[3][0]) } },
				{ { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] },{ xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[3][1]) } },
				{ { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][4][0], xy3da[xyp[5][1]][4][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[3][2]) } },
				{ { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] },{ xy3da[xyp[5][1]][6][0], xy3da[xyp[5][1]][6][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }  },


				{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[26][1]) }, { pos+1 }  },
					{ { rx+2,  ry+6 },{ rx+2,  ry+8 }, { rx+5, ry+8 }, { rx+5, ry+6 }, { rx+2, ry+6 } },

				
					{ { type+0 }, { Color.parseColor(pcolor[4][0]) } },
				{ { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] },{ xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][0][0], xy3da[xyp[5][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[4][1]) } },
				{ { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] },{ xy3da[xyp[5][1]][4][0], xy3da[xyp[5][1]][4][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }, { xy3da[xyp[5][1]][1][0], xy3da[xyp[5][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[4][2]) } },
				{ { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] },{ xy3da[xyp[5][1]][5][0], xy3da[xyp[5][1]][5][1] },{ xy3da[xyp[5][1]][6][0], xy3da[xyp[5][1]][6][1] }, { xy3da[xyp[5][1]][3][0], xy3da[xyp[5][1]][3][1] }, { xy3da[xyp[5][1]][2][0], xy3da[xyp[5][1]][2][1] }  },

				{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[26][2]) }, { pos+1 }  },
					{ { rx+2,  ry+6 },{ rx+2,  ry+8 }, { rx+5, ry+8 }, { rx+5, ry+6 }, { rx+2, ry+6 } },

			},
			
		};
			break;


		case 6:
			dimensional_1 = new float[][][][] {


			{ //s_gon 6 

			{ { 1*tile },{ 1*tile }, { shapes+4 }, { col+3, rows+2 } },

			// square

			{ { type+2, vars, stroke+4 }, {  Color.parseColor(pcolor[3][0]) }, { pos+1 }  },
			{ { rx+2,  ry+2 },{ rx+2,  ry+8 }, { rx+8, ry+8 }, { rx+8, ry+2 }, { rx+2, ry+2 } },

			{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[4][0]) }, { pos+1 }  },
			{ { rx+2,  ry+2 },{ rx+2,  ry+8 }, { rx+8, ry+8 }, { rx+8, ry+2 }, { rx+2, ry+2 } },

			{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[4][1]) }, { pos+1 }  },
			{ { rx+2,  ry+2 },{ rx+2,  ry+8 }, { rx+8, ry+8 }, { rx+8, ry+2 }, { rx+2, ry+2 } },




			},
		};

			break;

			
		case 4:
			
			dimensional_1 = new float[][][][] {
			
			{ //s_gon 4  
				
				{ { 18*tile },{ 10*tile }, { shapes+9 }, { col+3, rows+1 } },
				
				{ { type+5, vars+3 }, { Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][1]), Color.parseColor(pcolor[8][2]) } },
				{ { rx+5f,  ry+0 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+5, ry+0 } }, 
				
				{ { type+5, vars+3 }, { Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][1]), Color.parseColor(pcolor[8][2]) } },
				{ { rx+8f,  ry+2 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+8, ry+2 } }, 
				
				{ { type+5, vars+3 }, { Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][0]), Color.parseColor(pcolor[8][1]), Color.parseColor(pcolor[8][2]) }, { pos+1 } },
				{ { rx+2f,  ry+1 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+2, ry+1 } }, 
				

				{ { type+5, vars+3 }, { Color.parseColor(pcolor[12][0]), Color.parseColor(pcolor[12][0]),  Color.parseColor(pcolor[12][1]), Color.parseColor(pcolor[12][2]) } },
				{ { rx+5f,  ry+0 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+5, ry+0 } }, 
				
				{ { type+5, vars+3  }, { Color.parseColor(pcolor[12][0]), Color.parseColor(pcolor[12][0]), Color.parseColor(pcolor[12][1]), Color.parseColor(pcolor[12][2]) } },
				{ { rx+8f,  ry+2 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+8, ry+2 } }, 
				
				{ { type+5, vars+3  }, { Color.parseColor(pcolor[12][0]), Color.parseColor(pcolor[12][0]), Color.parseColor(pcolor[12][1]), Color.parseColor(pcolor[12][2]) }, { pos+1 }  },
				{ { rx+2f,  ry+1 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+2, ry+1 } }, 
				
				

				{ { type+5, vars+3 }, {  Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][1]), Color.parseColor(pcolor[14][2]) } },
				{ { rx+5f,  ry+0 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+5, ry+0 } }, 
				
				{ { type+5, vars+3 }, {  Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][1]), Color.parseColor(pcolor[14][2]) } },
				{ { rx+8f,  ry+2 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+8, ry+2 } }, 
				
				{ { type+5, vars+3 }, {  Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][0]), Color.parseColor(pcolor[14][1]), Color.parseColor(pcolor[14][2]) }, { pos+1 } },
				{ { rx+2f,  ry+1 },{ rx+0f,  ry+10f },{ rx+10, ry+10f },{ rx+2, ry+1 } }, 
				
				
				
			},	
			
			};
			
			break;
			

		case 32:


			dimensional_1 = new float[][][][] {

					{ //s_gon 32  

							{ { 10*tile },{ 10*tile }, { shapes+12 }, { col+3, rows+2 } },


							{ { type+2, vars, stroke+20 }, { Color.parseColor(pcolor[6][0]) }  },
							{ { rx+5,  ry+10 },{ rx+5,  ry+4 } },

							{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[6][0]) }  },
							{ { rx+5,  ry+4 },{ rx+8,  ry+4 }, { rx+8, ry+1 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[6][0]) }  },
							{ { rx+8,  ry+2 },{ rx+9,  ry+2 }, { rx+9, ry+0 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[6][0]) }  },
							{ { rx+8,  ry+3 },{ rx+10,  ry+1 }, { rx+10, ry+1 } },

							{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[6][0]) }  },
							{ { rx+5,  ry+4 },{ rx+3,  ry+4 }, { rx+3, ry+0 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[6][0]) },  { pos+1 } },
							{ { rx+3,  ry+3 },{ rx+1,  ry+2 }, { rx+1, ry+1 } },




							{ { type+2, vars, stroke+20 }, { Color.parseColor(pcolor[15][0]) }  },
							{ { rx+5,  ry+10 },{ rx+5,  ry+4 } },

							{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[15][0]) }  },
							{ { rx+5,  ry+4 },{ rx+8,  ry+4 }, { rx+8, ry+1 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[15][0]) }  },
							{ { rx+8,  ry+1 },{ rx+9,  ry+1 }, { rx+9, ry+0 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[15][0]) }  },
							{ { rx+8,  ry+3 },{ rx+10,  ry+1 }, { rx+10, ry+1 } },

							{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[15][0]) }  },
							{ { rx+5,  ry+4 },{ rx+3,  ry+4 }, { rx+3, ry+0 } },

							{ { type+2, vars, stroke+4 }, { Color.parseColor(pcolor[15][0]) },  { pos+1 } },
							{ { rx+3,  ry+3 },{ rx+1,  ry+2 }, { rx+1, ry+1 } },



					},
			};




			break;
			
			

		case 7:
			dimensional_1 = new float[][][][] {
				{ //s_gon 7 
					
					{ { 2*tile },{ 2*tile }, { shapes+6, border+0 }, { col+3, rows+2 } },
						
					//"#73555D" "#9A7A6D" "#F4DBC1"


					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[6][0]) }, {pos+1} },
					{ { rx+0,  ry+9 },{ rx+9,  ry+9 }, { rx+9, ry+2 } },

					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[15][0]) }, {pos+1} },
					{ { rx+0,  ry+9 },{ rx+9,  ry+9 }, { rx+9, ry+2 } },

					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[17][0]) }, {pos+2} },
					{ { rx+0,  ry+9 },{ rx+9,  ry+9 }, { rx+9, ry+2 } },

					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[6][0]) }, {pos+1} },
					{ { rx+10,  ry+9 },{ rx+1,  ry+9 }, { rx+1, ry+2 } },

					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[15][0]) }, {pos+1} },
					{ { rx+10,  ry+9 },{ rx+1,  ry+9 }, { rx+1, ry+2 } },

					{ { type+2, vars, stroke+10 }, { Color.parseColor(pcolor[17][0]) }, {pos+1} },
					{ { rx+10,  ry+9 },{ rx+1,  ry+9 }, { rx+1, ry+2 } },

				},
				
				
		};
			
		break;	
		
		
		
		case 11:
			dimensional_1 = new float[][][][] {
			{ //s_gon 11 
							
				{ { 8*tile },{ 8*tile }, { shapes+9, border+0 }, { col+3, rows+1 } },
					
				//"#73555D" "#9A7A6D" "#F4DBC1"
			
				
				{ { type+0 }, { Color.parseColor(pcolor[7][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[7][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[7][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				

				{ { type+0 }, { Color.parseColor(pcolor[16][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[16][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[16][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				
				

				{ { type+0 }, { Color.parseColor(pcolor[18][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[18][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[18][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				
				
				
			},
			};
			break;
		
		
		
			
		case 8:
			dimensional_1 = new float[][][][] {
			{ //s_gon 8 
							
				{ { 8*tile },{ 8*tile }, { shapes+18, border+0 }, { col+3, rows+2 } },
					
				//"#73555D" "#9A7A6D" "#F4DBC1"
				
				

				{ { type+0 }, { Color.parseColor(pcolor[6][0]) } },
				{ { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] },{ xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[6][1]) } },
				{ { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][4][0], xy3da[xyp[0][0]][4][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[6][2]) }, {pos+1} },
				{ { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] },{ xy3da[xyp[0][0]][6][0], xy3da[xyp[0][0]][6][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[15][0]) } },
				{ { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] },{ xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[15][1]) } },
				{ { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][4][0], xy3da[xyp[0][0]][4][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[15][2]) }, {pos+1} },
				{ { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] },{ xy3da[xyp[0][0]][6][0], xy3da[xyp[0][0]][6][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[17][0]) } },
				{ { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] },{ xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][0][0], xy3da[xyp[0][0]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[17][1]) } },
				{ { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] },{ xy3da[xyp[0][0]][4][0], xy3da[xyp[0][0]][4][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }, { xy3da[xyp[0][0]][1][0], xy3da[xyp[0][0]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[17][2]) }, {pos+2} },
				{ { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] },{ xy3da[xyp[0][0]][5][0], xy3da[xyp[0][0]][5][1] },{ xy3da[xyp[0][0]][6][0], xy3da[xyp[0][0]][6][1] }, { xy3da[xyp[0][0]][3][0], xy3da[xyp[0][0]][3][1] }, { xy3da[xyp[0][0]][2][0], xy3da[xyp[0][0]][2][1] }  }, 
				
				
				
				{ { type+0 }, { Color.parseColor(pcolor[7][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[7][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[7][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[16][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[16][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[16][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				
				{ { type+0 }, { Color.parseColor(pcolor[18][0]) } },
				{ { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] },{ xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][0][0], xy3da[xyp[0][1]][0][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[18][1]) } },
				{ { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] },{ xy3da[xyp[0][1]][4][0], xy3da[xyp[0][1]][4][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }, { xy3da[xyp[0][1]][1][0], xy3da[xyp[0][1]][1][1] }  }, 
				{ { type+0 }, { Color.parseColor(pcolor[18][2]) }, {pos+1} },
				{ { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] },{ xy3da[xyp[0][1]][5][0], xy3da[xyp[0][1]][5][1] },{ xy3da[xyp[0][1]][6][0], xy3da[xyp[0][1]][6][1] }, { xy3da[xyp[0][1]][3][0], xy3da[xyp[0][1]][3][1] }, { xy3da[xyp[0][1]][2][0], xy3da[xyp[0][1]][2][1] }  }, 
				
				
				
				
				
			},
			};
			break;
						
		
			
			case 10:
			dimensional_1 = new float[][][][] {
			
			{ //s_gon 10 
				
				{ { 1*tile },{ 1*tile }, { shapes+1, border+0 } },
					
				
				{ { type+0 }, { Color.parseColor("#FFFFFF") } },
				{ { 1, 0 }, { 0, 1 }, { 1, 2 }, { 2, 1 }, { 1, 0 } }, 
			
				
			}, }; break;



            case 16:
                dimensional_1 = new float[][][][] {

                        { //s_gon 16 

                                { { 1*tile },{ 1*tile }, { shapes+3, border+0 }, { col+3, rows+2 }  },


                                { { type+0 }, { Color.parseColor("#a4a8a4") }, { pos+1 } },
								{ { 2, 2 }, { 2, 4 }, { 4, 4 }, { 4, 2 }, { 2, 2 } },


								{ { type+0 }, { Color.parseColor("#6e726e") }, { pos+1 } },
								{ { 2, 2 }, { 2, 4 }, { 4, 4 }, { 4, 2 }, { 2, 2 } },


								{ { type+0 }, { Color.parseColor("#4f5551") }, { pos+1 } },
								{ { 2, 2 }, { 2, 4 }, { 4, 4 }, { 4, 2 }, { 2, 2 } },





						}, }; break;




            case 12:
			dimensional_1 = new float[][][][] {
			
			{  //s_gon 12
				
				{ { 2*tile },{ 2*tile }, { shapes+3, border+0 } },
				
				
				{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
				{ { xy3da[xyp[8][0]][0][0], xy3da[xyp[8][0]][0][1] },{ xy3da[xyp[8][0]][1][0], xy3da[xyp[8][0]][1][1] },{ xy3da[xyp[8][0]][2][0], xy3da[xyp[8][0]][2][1] }, { xy3da[xyp[8][0]][3][0], xy3da[xyp[8][0]][3][1] }, { xy3da[xyp[8][0]][0][0], xy3da[xyp[8][0]][0][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
				{ { xy3da[xyp[8][0]][1][0], xy3da[xyp[8][0]][1][1] },{ xy3da[xyp[8][0]][4][0], xy3da[xyp[8][0]][4][1] },{ xy3da[xyp[8][0]][5][0], xy3da[xyp[8][0]][5][1] }, { xy3da[xyp[8][0]][2][0], xy3da[xyp[8][0]][2][1] }, { xy3da[xyp[8][0]][1][0], xy3da[xyp[8][0]][1][1] }  }, 
				
				{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+0 } },
				{ { xy3da[xyp[8][0]][2][0], xy3da[xyp[8][0]][2][1] },{ xy3da[xyp[8][0]][5][0], xy3da[xyp[8][0]][5][1] },{ xy3da[xyp[8][0]][6][0], xy3da[xyp[8][0]][6][1] }, { xy3da[xyp[8][0]][3][0], xy3da[xyp[8][0]][3][1] }, { xy3da[xyp[8][0]][2][0], xy3da[xyp[8][0]][2][1] }  }, 
				
			}, };
			break;
			
			case 13:
			
			dimensional_1 = new float[][][][] {
			
			{  //s_gon 13 
				
				{ { 3*tile },{ 1*tile }, { shapes+3, border+0 }, { col+3, rows+2 } },
				
				
				{ { type+0 }, { Color.parseColor("#FFFFFF") }, { pos+1 } },
				{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				

				{ { type+0 }, { Color.parseColor("#e6e6e6") }, { pos+1 } },
				{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				

				{ { type+0 }, { Color.parseColor("#e6e6e6") }, { pos+1 } },
				{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
				
			}, };
			break;
			
			
			 case 14:
				dimensional_1 = new float[][][][] {
							
				{ //s_gon 9 
					
					{ { 10*tile },{ 10*tile }, { shapes+1, border+0 } },
						
					
					{ { type+6 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"),  Color.parseColor("#FFFFFF"),
						 /*Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"),*/ Color.parseColor("#FFFFFF") } },
					{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
					
				}, }; break;
				
				
			case 15:	
				dimensional_1 = new float[][][][] {
				{ //s_gon 15 
					
					{ { 22*tile },{ 10*tile }, { shapes+3 }, { col+3, rows+1 } },
					
					
					{ { type+8, vars+4 }, { Color.parseColor(pcolor[25][0]), Color.parseColor(pcolor[25][0]),
						Color.parseColor(pcolor[25][0]),Color.parseColor(pcolor[25][0]),
						Color.parseColor(pcolor[25][0]) }, { pos+1 } },
					{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
					
					
					{ { type+8, vars+4 }, { Color.parseColor(pcolor[25][0]), Color.parseColor(pcolor[25][0]),
						Color.parseColor(pcolor[25][0]),Color.parseColor(pcolor[25][0]),
						Color.parseColor(pcolor[25][0]) }, { pos+1 } },
					{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
					
					
					
					{ { type+8, vars+4 }, { Color.parseColor(pcolor[25][1]), Color.parseColor(pcolor[25][1]),
						Color.parseColor(pcolor[25][1]),Color.parseColor(pcolor[25][1]),
						Color.parseColor(pcolor[25][1]),Color.parseColor(pcolor[25][1]),
						Color.parseColor(pcolor[25][1]),Color.parseColor(pcolor[25][1]),
						Color.parseColor(pcolor[25][1]), Color.parseColor(pcolor[25][1]),Color.parseColor(pcolor[25][1]),  }, { pos+1 } },
					{ { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },
					
					
					
					
				},}; break;
				
			case 18:	
				dimensional_1 = new float[][][][] {
				{ //s_gon 18 
					
					{ { 8*tile },{ 8*tile }, { shapes+2 }, { col+3, rows+1 } },
						
					{ { type+6 }, { 
						Color.parseColor(pcolor[24][0]), Color.parseColor(pcolor[24][0]), 
						Color.parseColor(pcolor[24][0]) }, { pos+1 } },
						{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
				
					{ { type+6 }, { 
							Color.parseColor(pcolor[24][1]), Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]), Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]), Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]), Color.parseColor(pcolor[24][1]),
							Color.parseColor(pcolor[24][1]),
							
							}, { pos+1 } },
							{ { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 }, { 0, 0 } }, 
					
							
						
				},}; break;

			case 21:
				
				dimensional_1 = new float[][][][] {
				{ //s_gon 21 
					
					{ { 6*tile },{ 6*tile }, { shapes+1, border+0 } },
						
					/*
					{ { type+0 }, { Color.parseColor("#FFFFFF"),  Color.parseColor("#FFFFFF") } },
					{ { 4, 4 }, { 4, 6 }, { 6, 6 }, { 6, 4 }, { 4, 4 } }, 
					*/
					
					
					{ { type+0 }, { Color.parseColor("#F7FDFF") } },
					{ { 5, 5, 5 }  }, 
			
					///String opacity[] = { "FF", "E6", "CC", "B3", "99", "80", "66", "40", "26", "00" } ;
			
					// TODO
					/*
					
					{ { type+8, vars+4 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF") } },
					{ { 4, 0 }, { 4, 4 }, { 6, 4 }, { 6, 0 }, { 4, 0 } }, 
				
					
					{ { type+8, vars+3 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF")  } },
					{ { 4, 6 }, { 4, 10 }, { 6, 10 }, { 6, 6 }, { 4, 6 } }, 
				
					{ { type+8, vars+2 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF") } },
					{ { 0, 4 }, { 0, 6 }, { 4, 6 }, { 4, 4 }, { 0, 4 } }, 
				
					{ { type+8, vars+1 }, { Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF") } },
					{ { 6, 4 }, { 6, 6 }, { 10, 6 }, { 10, 4 }, { 6, 4 } }, 
				
				
				*/
				
					
					
				},}; break;
				
				
			
			
		case 26: 
			
			dimensional_1 = new float[][][][] {
				
				{  //s_gon 26 
					
					// TODO
				
				{ { 2*tile },{ 2*tile }, { shapes+2 }, { col+1, rows+1 } },

				{ { type+0, vars+10 }, { Color.parseColor("#4A8182") } },
				{ { 3, 4, 5, 6, 8   }, { 3, 3 } }, 
				
				{ { type+0, vars+10 }, { Color.parseColor("#FFFFFF") } },
				{ { 18   }, { 9, 9 } }, 
				
				}
				
				};
			
			break;
			
		default:
			break;
		}
		
		
		return dimensional_1;
	}
	
	
	
	
	
	
	
	private float mtx = 0;
	private float mty = 0;
	
	public void setmtx(float m) {
		mtx = m;
	}
	public float getmtx() {
		return mtx;
	}
	public void setmty(float m) {
		mty = m;
	}
	public float getmty() {
		return mty;
	}
	
	
	public void loadCreate(Canvas canvas, int layout) {
		mtx = 0; mty = 0;
		// background
		cengine.squareshape(canvas, layout, getDimensional(0), 0, 0, 0);
	}
	
	
	public void textureCreate(Canvas canvas, int layout) {

		 float[][][][] dimensional5 = null;
		 
		 int s_gon = 0;
		
		if( REPLACE_CANVAS == 1 ) {
		
	
		/*
		
		mtx = 0; mty = 4;
		
		cengine.squareshape(canvas, layout, getDimensional(15), 0, 4);
		
		mtx = 6; mty = 0;
		
		cengine.squareshape(canvas, layout, getDimensional(14), 6, 0);

		mtx = 6; mty = 0;
	
		cengine.squareshape(canvas, layout, getDimensional(0), 6, 0);
		
		mtx = 12; mty = 2;

		cengine.squareshape(canvas, layout, getDimensional(9), 12, 2);

		*/
		
		mtx = 0; mty = 0;
		
		}
		
		
	}
	
	
	
	
	

}
