{
	"patcher" : 	{
		"fileversion" : 1,
		"appversion" : 		{
			"major" : 5,
			"minor" : 1,
			"revision" : 9
		}
,
		"rect" : [ 78.0, 144.0, 791.0, 501.0 ],
		"bglocked" : 0,
		"defrect" : [ 78.0, 144.0, 791.0, 501.0 ],
		"openrect" : [ 0.0, 0.0, 0.0, 0.0 ],
		"openinpresentation" : 0,
		"default_fontsize" : 12.0,
		"default_fontface" : 0,
		"default_fontname" : "Anonymous Pro",
		"gridonopen" : 0,
		"gridsize" : [ 15.0, 15.0 ],
		"gridsnaponopen" : 0,
		"toolbarvisible" : 1,
		"boxanimatetime" : 200,
		"imprint" : 0,
		"enablehscroll" : 1,
		"enablevscroll" : 1,
		"devicewidth" : 0.0,
		"boxes" : [ 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(clojure.core/refer 'clojure.core)",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 510.0, 375.0, 233.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-15",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "ns foogoo",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 405.0, 420.0, 69.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-9",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "*ns*",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 525.0, 270.0, 37.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-11",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "ns user",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 495.0, 330.0, 56.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-7",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "script show-ns",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 495.0, 150.0, 102.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-12",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(println max/maxObject)",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 480.0, 210.0, 162.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-10",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "getscript",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 390.0, 255.0, 70.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-8",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "print",
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 300.0, 285.0, 44.0, 18.0 ],
					"numinlets" : 1,
					"id" : "obj-1",
					"numoutlets" : 0
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "script print-maxObject-now",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 450.0, 90.0, 182.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-5",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "run plugh",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 345.0, 180.0, 72.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-4",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "placeholder FOOBLY",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 210.0, 180.0, 131.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-3",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(nth [:a] 0)",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 210.0, 150.0, 93.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-2",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(dup-rev [\\\"A\\\" \\\"B\\\" 1])",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 210.0, 120.0, 177.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-34",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(defn dup-rev [x] (concat x (reverse x) x))",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 45.0, 75.0, 296.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-30",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "15",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 30.0, 315.0, 264.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-28",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(.outlet max/maxObject 1 (dup-rev [2 3 4]))",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 45.0, 45.0, 295.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-26",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(println *ns*)",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 75.0, 405.0, 102.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-25",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "print OUT",
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 135.0, 270.0, 72.0, 18.0 ],
					"numinlets" : 1,
					"id" : "obj-24",
					"numoutlets" : 0
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "message",
					"text" : "(.outlet max/maxObject 1 15)",
					"outlettype" : [ "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 15.0, 15.0, 197.0, 16.0 ],
					"numinlets" : 2,
					"id" : "obj-21",
					"numoutlets" : 1
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "print VALUE",
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 45.0, 270.0, 86.0, 18.0 ],
					"numinlets" : 1,
					"id" : "obj-13",
					"numoutlets" : 0
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "mxj net.loadbang.mxj.Clojure 1 2 @ns user",
					"outlettype" : [ "", "", "" ],
					"fontname" : "Anonymous Pro",
					"fontsize" : 12.0,
					"patching_rect" : [ 45.0, 240.0, 279.0, 18.0 ],
					"numinlets" : 1,
					"id" : "obj-16",
					"numoutlets" : 3
				}

			}
 ],
		"lines" : [ 			{
				"patchline" : 				{
					"source" : [ "obj-15", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-9", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-11", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-7", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-5", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-4", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-2", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-16", 1 ],
					"destination" : [ "obj-24", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-21", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-16", 0 ],
					"destination" : [ "obj-13", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-25", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-26", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-16", 1 ],
					"destination" : [ "obj-28", 1 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-30", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-34", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-3", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-16", 2 ],
					"destination" : [ "obj-1", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-8", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-10", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-12", 0 ],
					"destination" : [ "obj-16", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
 ]
	}

}
