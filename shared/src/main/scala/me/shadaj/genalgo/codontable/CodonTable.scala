package me.shadaj.genalgo.codontable

import me.shadaj.genalgo.sequences.AminoAcid
import me.shadaj.genalgo.sequences.RNA
import me.shadaj.genalgo.sequences.Protein

trait CodonTable {
  def aminoForCodon(codon: RNA): AminoAcid
  def proteinForRNA(seq: RNA): Protein
  def codonsForAmino(amino: AminoAcid): List[RNA]
}