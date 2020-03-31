package asuna
class Merge2[X1 , X2, Target]
object Merge2 {
        implicit def  nodetag1_merge2_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1]
        ): Merge2[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[Target1]] = {
            new Merge2[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[Target1]]
        }
        implicit def  tupletag1_merge2_implicit[
            X1_C1 , X2_C1,
            Target1
        ]( implicit 
            tupleTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1]
        ): Merge2[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[Target1]] = {
            new Merge2[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[Target1]]
        }
        implicit def  nodetag2_merge2_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1] , nodeTagImplicit2: Merge2[X1_C2 , X2_C2 , Target2]
        ): Merge2[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge2[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[Target1 , Target2]]
        }
        implicit def  tupletag2_merge2_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2,
            Target1 , Target2
        ]( implicit 
            tupleTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1] , tupleTagImplicit2: Merge2[X1_C2 , X2_C2 , Target2]
        ): Merge2[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge2[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[Target1 , Target2]]
        }
    implicit def  property_tag_merge2_implicit[
        X1 , X2, Data
    ]: Merge2[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag2[X1 , X2, Data]] = {
        new Merge2[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag2[X1 , X2, Data]]
    }
}
